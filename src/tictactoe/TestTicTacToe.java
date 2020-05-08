package tictactoe;

import java.util.Scanner;


public class TestTicTacToe {

    public static MovingAndMap map = new MovingAndMap();
    private static String command;

    private static void ExecutePlayerCommand() {
        String[] commands = command.split(" ");
        map.move(Integer.parseInt(commands[0]), Integer.parseInt(commands[1]));
    }

    private static void getCommandFromPlayer() {
        Scanner input = new Scanner(System.in);
        command = input.nextLine();
    }

    public static void runGame() {
        while (MovingAndMap.isGame) {
            getCommandFromPlayer();
            ExecutePlayerCommand();
            map.printMap();
        }
    }
}
