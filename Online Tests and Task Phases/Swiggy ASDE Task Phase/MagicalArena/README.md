# Magical Arena Game

## Overview
"Magic Arena" is a simulation game where two players face off in a duel, using their attributes—fighting power, strength, and health—to determine the winner. This continues until one player's health hits zero, meaning they lose.

This repository includes the player model, unit tests, and the full Java implementation of the Magical Arena game.

## Files Description
- **src/main/java/Player.java**: Defines the `Player` class, including attributes for attack, strength, and health. It also has methods to check if the player is alive and to get or set these attributes.
  
- **src/main/java/MagicalArena.java**: Contains the `MagicalArena` class, which manages the game flow and simulates player interactions. This class handles the game logic and turn-taking based on player health.

- **test/java/PlayerTest.java**: Unit tests for the `Player` class, validating player initialization, health updates, and life status checks.
  
- **test/java/MagicalArenaTest.java**: Unit tests for the `MagicalArena` class, ensuring the attack mechanisms and overall game logic work as expected.

## Setup and Running the Game
Make sure Java is installed on your system. Follow these steps to compile and run the game:

1. **Compile the Code**:
   Navigate to the project's root directory and run:
   ```bash
   javac src/main/java/*.java
   ```
   
2. **Run the Game**:
   After compiling the classes, execute:
   ```bash
   java src/main/java/MagicalArena
   ```

## Game Mechanics and Edge Cases
- **Initialization**: Players start with specific health, strength, and attack values. Invalid values like negatives or non-integers are rejected and need to be re-entered.

- **Turn-based Combat**: The player with lower health attacks first. If both players have the same health, Player A goes first.

- **Dice Rolls**: Dice rolls determine the strength of attacks and defenses each turn. Both high and low roll scenarios are tested to ensure fair gameplay.

- **Health Calculation**: The damage a player deals is their attack value multiplied by their dice roll. The defense is the opponent's strength multiplied by their dice roll. The actual damage is the attack minus the defense, and this is subtracted from the defender's health. If the damage calculation results in a negative number, it's set to zero.

- **End Condition**: The game ends when a player's health drops to zero. If both players reach zero health at the same time, it's a draw.

## Round-by-Round Execution

- **Round Counting**: Each combat round is numbered to track the game's progress.
- **Output Coloring**: The output uses colors to make it easier to read—damage is highlighted in red, while defensive actions with no damage are shown in green.

## Sample Gameplay Sequence
Here's an example of how a typical game might play out:

```
Enter name for Player A: Hriday
Health (positive integer): 1000
Strength (positive integer): 30
Attack (positive integer): 40

Enter name for Player B: Paras
Health (positive integer): 1200
Strength (positive integer): 30
Attack (positive integer): 35

Round 1 ------------------------------
Hriday attacks Paras: no damage (attack roll: 1, defend roll: 5)
Hriday Health: 1000
Paras Health: 1200

...

Round 36 ------------------------------
Hriday attacks Paras: 90 damage (attack roll: 6, defend roll: 5)
Hriday Health: 5
Paras Health: 0

Hriday wins!

Final Health Status:
Hriday Health: 5
Paras Health: 0
```

## Evaluation Criteria Addressed
- **Simple Design**: Focuses on essential game mechanics without unnecessary complexity.
- **Readability**: Well-structured code with clear naming conventions to make it easy to understand.
- **Modeling**: Efficient design of the `Player` and `Magical Arena` classes to fit the game's needs.
- **Maintainability**: Modular code structure makes it easy to update and maintain.
- **Testability**: Comprehensive unit tests validate the game mechanics in various scenarios.

## Commit History
The project has a detailed commit history documenting significant updates and improvements throughout development.