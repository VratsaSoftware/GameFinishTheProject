package app.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class MainScreen extends JFrame {
    private JButton btnPiano = new JButton("Piano");
    private JPanel mainPanel = new JPanel();
    public MainScreen() {
        setSize(600,600);
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
