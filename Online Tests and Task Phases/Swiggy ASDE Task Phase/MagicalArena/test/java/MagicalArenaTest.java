package test.java;

import main.java.Player;
import main.java.MagicalArena;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

public class MagicalArenaTest {

    @Test
    public void testAttack() {
        Player attacker = new Player(100, 10, 20, "Attacker");
        Player defender = new Player(100, 10, 20, "Defender");
        Random controlledRandom = new Random() {
            int count = 0;
            @Override
            public int nextInt(int bound) {
                return ++count; // Controlled random that increases: 1, 2, ...
            }
        };

        MagicalArena arena = new MagicalArena();
        arena.attack(attacker, defender, controlledRandom); // Assuming attack is now a non-static accessible method
        assertEquals(80, defender.getHealth());  // Assumes first roll is 1 (attacker), second roll is 1 (defender)

        arena.attack(defender, attacker, controlledRandom);
        assertEquals(60, attacker.getHealth()); // Assumes next roll sequence: 2 (attacker), 2 (defender)
    }
}