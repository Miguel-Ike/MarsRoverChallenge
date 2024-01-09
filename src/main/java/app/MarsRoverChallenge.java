/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package app;

import java.util.InputMismatchException;
import java.util.Scanner;

import app.controller.RoverController;
import app.model.Plateau;
import app.model.Rover;

/**
 *
 * @author Miguel_Angel
 */
public class MarsRoverChallenge {

    private static final String YES_OPTION = "y";

    private static void init() {
        String msg = """
                |--------------------------------------------------------------------------|
                |            Start of the Mars Rover challenge by Miguel-Ike...            |
                |--------------------------------------------------------------------------|
                """;
        System.out.println("\n" + msg);
    }

    private static void end() {
        String msg = """
                |--------------------------------------------------------------------------|
                |             End of the Mars Rover challenge by Miguel-Ike...             |
                |--------------------------------------------------------------------------|
                """;
        System.out.println("\n" + msg);
    }

    private static void displayPlateauDimensionsPrompt() {
        System.out.println("\nPlease enter the dimensions of the Plateau (example: 5 5):");
    }

    private static void displayInitialPositionPrompt(int roverCount) {
        System.out.println("\nEnter the initial position of Rover " + roverCount + " (example: 1 2 N): ");
    }

    private static void displayMovementCommandsPrompt(int roverCount) {
        System.out.println("\nEnter the movement commands for Rover " + roverCount
                + " (example: LMLMLMLMM): ");
    }

    private static void displayFinalPosition(int roverCount, Rover rover) {
        System.out.println(
                "\nFinal position of Rover " + roverCount + ": " + rover.getX() + " " + rover.getY() + " "
                        + rover.getDirection());
    }

    private static void displayContinuePrompt() {
        System.out.println("\nDo you want to try with another Rover? (Yes/No): ");
    }

    private static Plateau initializePlateau(Scanner scanner) {
        displayPlateauDimensionsPrompt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        return new Plateau(width, height);
    }

    private static boolean processRover(Scanner scanner, Plateau plateau, int roverCount) {
        displayInitialPositionPrompt(roverCount);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        char direction = scanner.next().toUpperCase().charAt(0);

        Rover rover = new Rover(x, y, direction);
        RoverController controller = new RoverController(plateau);

        displayMovementCommandsPrompt(roverCount);
        String commands = scanner.next().toUpperCase();
        controller.executeCommands(rover, commands);

        displayFinalPosition(roverCount, rover);

        displayContinuePrompt();
        return scanner.next().toLowerCase().startsWith(YES_OPTION);
    }

    public static void main(String[] args) {
        init();

        try (Scanner scanner = new Scanner(System.in)) {
            Plateau plateau = initializePlateau(scanner);

            int roverCount = 0;
            boolean continueWithNextRover;

            do {
                roverCount++;
                continueWithNextRover = processRover(scanner, plateau, roverCount);
            } while (continueWithNextRover);
        } catch (InputMismatchException ex) {
            System.err.println("Input error. Please enter the data correctly.");
        }

        end();
    }
}
