package app;

import app.snake.Snake;
import app.snake.StartSnake;
import app.ui.MainScreen;
import app.tictactoe.TestTicTacToe;

import javax.swing.*;

public class App {

    public static void main(String[] args) {

        new StartSnake();
        new MainScreen();
        new TestTicTacToe();

    }
}
