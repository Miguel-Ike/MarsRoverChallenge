import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import app.model.Rover;

public class RoverTest {
    @Test
    public void testMoveNorth() {
        Rover rover = new Rover(1, 1, 'N');
        rover.move();
        assertEquals(2, rover.getY(), "Expected Y-coordinate to increase by 1 when moving North");
    }

    @Test
    public void testTurnLeft() {
        Rover rover = new Rover(1, 1, 'N');
        rover.turnLeft();
        assertEquals('W', rover.getDirection(), "Expected direction to be 'W' after turning left");
    }

    @Test
    public void testTurnRight() {
        Rover rover = new Rover(1, 1, 'N');
        rover.turnRight();
        assertEquals('E', rover.getDirection(), "Expected direction to be 'E' after turning right");
    }
}
