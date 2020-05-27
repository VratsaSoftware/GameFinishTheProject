package app.snake;

import javax.swing.*;
import java.awt.*;

public class StartSnake {


    public StartSnake() {
        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
            ex.setLocation(0,200);
        });
    }
}


