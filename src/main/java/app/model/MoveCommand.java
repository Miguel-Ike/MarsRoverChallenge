package app.model;

public class MoveCommand implements ICommand {

    private Plateau plateau;

    public MoveCommand(Plateau plateau) {
        this.plateau = plateau;
    }

    @Override
    public void execute(Rover rover) {
        int newX = rover.getX();
        int newY = rover.getY();
        switch (rover.getDirection()) {
            case 'N':
                newY++;
                break;
            case 'E':
                newX++;
                break;
            case 'S':
                newY--;
                break;
            case 'W':
                newX--;
                break;
        }

        if (plateau.isPositionValid(newX, newY)) {
            rover.move();
        } else {
            System.out.println("Invalid move command...");
        }
    }

}
