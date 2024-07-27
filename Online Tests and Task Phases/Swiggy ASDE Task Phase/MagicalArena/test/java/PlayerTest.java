package test.java;

import main.java.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void testPlayerInitialization() {
        Player player = new Player(100, 10, 20, "TestPlayer");
        assertEquals(100, player.getHealth());
        assertEquals(10, player.getStrength());
        assertEquals(20, player.getAttack());
        assertEquals("TestPlayer", player.getName());
    }

    @Test
    public void testSetHealth() {
        Player player = new Player(100, 10, 20, "TestPlayer");
        player.setHealth(80);
        assertEquals(80, player.getHealth());
        player.setHealth(-10);
        assertEquals(0, player.getHealth());
        player.setHealth(150);
        assertEquals(150, player.getHealth()); // Test setting health above initial value
    }

    @Test
    public void testIsAlive() {
        Player player = new Player(100, 10, 20, "TestPlayer");
        assertTrue(player.isAlive());
        player.setHealth(1);
        assertTrue(player.isAlive());  // Boundary condition test
        player.setHealth(0);
        assertFalse(player.isAlive());
        player.setHealth(-10);
        assertFalse(player.isAlive()); // Test negative health condition
    }
}