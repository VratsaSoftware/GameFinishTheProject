package app.ui;

import app.ui.piano.GuitarPlayer;
import app.ui.piano.PianoPlayer;
import tictactoe.TestTicTacToe;

import javax.swing.*;

public class MainScreen extends JFrame {
    private JButton btnPiano = new JButton("Piano");
    private JButton btnGuitar = new JButton("Guitar");
    private JPanel mainPanel = new JPanel();


    public MainScreen() {
        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        add(mainPanel);
        mainPanel.add(btnPiano);
        mainPanel.add(btnGuitar);
        btnPiano.addActionListener(actionEvent -> {
            new PianoPlayer();
        });
        btnGuitar.addActionListener(actionEvent -> {
            new GuitarPlayer();
        });

    }

}
