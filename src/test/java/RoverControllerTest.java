import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import app.controller.RoverController;
import app.model.Plateau;
import app.model.Rover;

public class RoverControllerTest {
    @Test
    public void testExecuteCommandsRover1() {
        Plateau plateau = new Plateau(5, 5);
        RoverController roverController = new RoverController(plateau);

        Rover rover1 = new Rover(1, 2, 'N');
        roverController.executeCommands(rover1, "LMLMLMLMM");
        String result = rover1.getX() + " " + rover1.getY() + " " + rover1.getDirection();
        assertEquals("1 3 N", result, "Expected Rover 1 to be at 1 3 N after executing commands LMLMLMLMM");
    }

    @Test
    public void testExecuteCommandsRover2() {
        Plateau plateau = new Plateau(5, 5);
        RoverController roverController = new RoverController(plateau);

        Rover rover2 = new Rover(3, 3, 'E');
        roverController.executeCommands(rover2, "MMRMMRMRRM");
        String result = rover2.getX() + " " + rover2.getY() + " " + rover2.getDirection();
        assertEquals("5 1 E", result, "Expected Rover 2 to be at 5 1 E after executing commands MMRMMRMRRM");
    }
}
