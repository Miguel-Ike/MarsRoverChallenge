package app.model;

public class TurnLeftCommand implements ICommand {

    @Override
    public void execute(Rover rover) {
        rover.turnLeft();
    }
    
}
