package app.ui;

import app.ui.piano.PianoPlayer;

import javax.swing.*;

public class MainScreen extends JFrame {
    private JButton btnPiano = new JButton("Piano");
    private JPanel mainPanel = new JPanel();

    public MainScreen() {
        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        add(mainPanel);
        mainPanel.add(btnPiano);
        btnPiano.addActionListener(actionEvent -> {
            new PianoPlayer();
        });
    }
}
