package app.controller;

import app.model.MoveCommand;
import app.model.Plateau;
import app.model.Rover;
import app.model.TurnLeftCommand;
import app.model.TurnRightCommand;

public class RoverController {
    private Plateau plateau;

    public RoverController(Plateau plateau) {
        this.plateau = plateau;
    }

    public void executeCommands(Rover rover, String commands) {
        for (char command : commands.toCharArray()) {
            switch (command) {
                case 'L':
                    new TurnLeftCommand().execute(rover);
                    break;
                case 'R':
                    new TurnRightCommand().execute(rover);
                    break;
                case 'M':
                    new MoveCommand(plateau).execute(rover);
                    break;
                default:
                    System.out.println("Unknown command: " + command);
                    break;
            }
        }
    }
}
