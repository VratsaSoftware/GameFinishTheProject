package tictactoe;

import javax.swing.*;
import java.util.Scanner;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


public class TestTicTacToe {

    static Display display;
    public static MovingAndMap map;
    public static int WIDTH = 600;
    public static int HEIGHT = 600;
    public static InputManager input;
    static String command;

    public TestTicTacToe() {
        display = new Display(600, 600, "TicTacToe");
        input = new InputManager();
        map = new MovingAndMap();
        runGame();
    }


    private static void ExecutePlayerCommand() {
        String[] commands = command.split(" ");
        map.move(Integer.parseInt(commands[0]), Integer.parseInt(commands[1]));
    }

    private static void getCommandFromPlayer() {
        Scanner input = new Scanner(System.in);
        command = input.nextLine();
    }

    public MovingAndMap getMap() {
        return getMap();
    }

    public void runGame() {

        while (MovingAndMap.isGame) {
            input.update();
        }

    }
}
