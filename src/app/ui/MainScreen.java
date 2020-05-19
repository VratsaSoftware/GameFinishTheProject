package app.ui;

import app.ui.players.GuitarPlayer;
import app.ui.players.PianoPlayer;

import javax.swing.*;

public class MainScreen extends JFrame {
    private JButton btnPiano = new JButton("Piano Player");
    private JButton btnGuitar = new JButton("Guitar Player");
    private JPanel mainPanel = new JPanel();


    public MainScreen() {
        setSize(600, 300);
        setTitle("Music Player");
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
