package main.java;

/**
 * Represents a player in the Magical Arena game. Each player has attributes for health, strength, attack, and a name.
 */
public class Player {
    //Player Attributes 
    private int health;
    private int strength;
    private int attack;
    private String name;

    /**
     * Constructs a new Player with specified attributes.
     * @param health The health of the player. A player is considered "dead" when health is 0.
     * @param strength The strength of the player. This affects the player's ability to defend against attacks.
     * @param attack The attack power of the player. This determines the potential damage a player can inflict on opponents.
     * @param name The name of the player.
     */
    public Player(int health, int strength, int attack, String name){
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.name = name;
    }

    // Getters and setters
    /**
     * Returns the current health of the player.
     * @return The current health.
     */
    public int getHealth(){
        return health;
    }

    /**
     * Sets the health of the player. Health cannot go below 0.
     * @param health The new health value.
     */
    public void setHealth(int health){
        this.health = Math.max(health, 0);
    }

    /**
     * Returns the strength of the player.
     * @return The current strength.
     */
    public int getStrength(){
        return strength;
    }

    /**
     * Sets the strength of the player.
     * @param strength The new strength value.
     */
    public void setStrength(int strength){
        this.strength = strength;
    }

    /**
     * Returns the attack power of the player.
     * @return The current attack power.
     */
    public int getAttack(){
        return attack;
    }

    /**
     * Sets the attack power of the player.
     * @param attack The new attack value.
     */
    public void setAttack(int attack){
        this.attack = attack;
    }

    /**
     * Returns the name of the player.
     * @return The player's name.
     */
    public String getName(){
        return this.name;
    }

    /**
     * Checks if the player is still alive.
     * @return True if health is greater than 0, otherwise false.
     */
    public boolean isAlive(){
        return health > 0;
    }
}