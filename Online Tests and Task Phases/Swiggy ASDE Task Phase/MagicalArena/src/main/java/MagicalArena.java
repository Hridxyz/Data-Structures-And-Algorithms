package main.java;
import java.util.Random;
import java.util.Scanner;

/**
 * The MagicalArena class simulates a turn-based combat game where two 
 players attack each other until one's health reaches zero.
 * The program uses random dice rolls to determine the outcome of each attack
and incorporates ANSI color coding for better visibility of game actions.
 */

public class MagicalArena {
    //ANSI color codes for presentable output visiblity.
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";

    /**
     * the main method
     * initialization of players
     * initialization of the battle
     * @param args Not used.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        // Players initialization
        Player playerA = createPlayer(scanner, "A");
        Player playerB = createPlayer(scanner, "B");

        // Battle initialization
        startBattle(playerA, playerB);
        scanner.close(); // Close scanner 
    }

    /**
     * Creates a player with specified attributes after taking input from the user.
     * @param scanner The scanner object for input handling.
     * @param playerLabel The label (A or B) to identify the player during input prompts.
     * @return Player The created player object with attributes set.
     */
    private static Player createPlayer(Scanner scanner, String playerLabel) {
        System.out.print("Enter name for Player " + playerLabel + ": ");
        String name = scanner.nextLine();

        // Get player attributes
        int health = getInput(scanner, "Health (positive integer): ");
        int strength = getInput(scanner, "Strength (positive integer): ");
        int attack = getInput(scanner, "Attack (positive integer): ");
        System.out.println();
        
        return new Player(health, strength, attack, name);
    }

    /**
     * Prompts the user for an input and validates it to ensure it is a positive integer.
     * @param scanner The scanner object for input handling.
     * @param prompt The input prompt message.
     * @return int The validated input as a positive integer.
     */
    private static int getInput(Scanner scanner, String prompt) {
        int input;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next(); // discard non-integer input
                System.out.print(prompt);
            }
            input = scanner.nextInt();
            if (input <= 0) {
                System.out.println("Value must be positive. Please try again.");
            }
        } while (input <= 0);
        scanner.nextLine(); // clear buffer
        return input;
    }

    /**
     * Manages the battle rounds, determining who attacks and updating player health until one 
     player's health reaches zero.
     * @param playerA The first player.
     * @param playerB The second player.
     */
    public static void startBattle(Player playerA, Player playerB) {
        Random random = new Random();
        int round = 1; // Counts the number of rounds 

        // Continue rounds until one player is no longer alive
        while (playerA.isAlive() && playerB.isAlive()) {
            System.out.println("Round " + round + " ------------------------------");
            Player firstAttacker = (playerA.getHealth() <= playerB.getHealth()) ? playerA : playerB;
            Player defender = (firstAttacker == playerA) ? playerB : playerA;

            attack(firstAttacker, defender, random);
            displayHealthStatus(playerA, playerB);
            round++;
        }

        declareWinner(playerA, playerB);
    }

    /**
     * Simulates an attack between two players and applies damage based on dice rolls.
     * @param attacker The attacking player.
     * @param defender The defending player.
     * @param random The random object used to simulate dice rolls.
     */
    public static void attack(Player attacker, Player defender, Random random) {
        int attackRoll = random.nextInt(6) + 1;  // Attack die roll
        int defendRoll = random.nextInt(6) + 1;  // Defend die roll
        int attackDamage = attacker.getAttack() * attackRoll;
        int defendStrength = defender.getStrength() * defendRoll;
        int damage = attackDamage - defendStrength;

        // Apply damage if attack is successful
        if (damage > 0) {
            defender.setHealth(defender.getHealth() - damage);
            System.out.printf("%s attacks %s: %s%d damage%s (attack roll: %d, defend roll: %d)\n",
                              attacker.getName(), defender.getName(), ANSI_RED, damage, ANSI_RESET, attackRoll, defendRoll);
        } else {
            System.out.printf("%s attacks %s: %sno damage%s (attack roll: %d, defend roll: %d)\n",
                              attacker.getName(), defender.getName(), ANSI_GREEN, ANSI_RESET, attackRoll, defendRoll);
        }
    }

    /**
     * Displays the current health status of both players.
     * @param playerA The first player.
     * @param playerB The second player.
     */
    private static void displayHealthStatus(Player playerA, Player playerB) {
        System.out.println(ANSI_GREEN + playerA.getName() + " Health: " + playerA.getHealth() + ANSI_RESET);
        System.out.println(ANSI_GREEN + playerB.getName() + " Health: " + playerB.getHealth() + ANSI_RESET);
        System.out.println();
    }

    /**
     * Declares the winner based on who is still alive and displays the final health status.
     * @param playerA The first player.
     * @param playerB The second player.
     */
    private static void declareWinner(Player playerA, Player playerB) {
        if (playerA.isAlive()) {
            System.out.println(ANSI_GREEN + playerA.getName() + " wins!" + ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN + playerB.getName() + " wins!" + ANSI_RESET);
        }
        System.out.println();
        System.out.println("Final Health Status:");
        System.out.println(playerA.getName() + " Health: " + playerA.getHealth());
        System.out.println(playerB.getName() + " Health: " + playerB.getHealth());
        System.out.println();
    }
}