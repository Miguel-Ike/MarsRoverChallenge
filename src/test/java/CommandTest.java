import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import app.model.ICommand;
import app.model.MoveCommand;
import app.model.Plateau;
import app.model.Rover;
import app.model.TurnLeftCommand;
import app.model.TurnRightCommand;

public class CommandTest {
    @Test
    public void testMoveCommand() {
        Plateau plateau = new Plateau(5, 5);
        Rover rover = new Rover(1, 1, 'N');
        ICommand moveCommand = new MoveCommand(plateau);

        moveCommand.execute(rover);

        assertEquals(2, rover.getY(), "Expected Rover to move North and increase Y-coordinate by 1");
    }

    @Test
    public void testTurnLeftCommand() {
        Rover rover = new Rover(1, 1, 'N');
        ICommand turnLeftCommand = new TurnLeftCommand();

        turnLeftCommand.execute(rover);

        assertEquals('W', rover.getDirection(), "Expected Rover to turn left and face West");
    }

    @Test
    public void testTurnRightCommand() {
        Rover rover = new Rover(1, 1, 'N');
        ICommand turnRightCommand = new TurnRightCommand();

        turnRightCommand.execute(rover);

        assertEquals('E', rover.getDirection(), "Expected Rover to turn right and face East");
    }
}
