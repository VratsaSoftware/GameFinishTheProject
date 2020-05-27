package app.tictactoe;

import javax.swing.*;
import java.awt.*;

public class TextureManager extends JComponent {

    int x;
    int y;
    int width;
    int height;
    String path;

    TextureManager() {
    }

    public TextureManager(int x, int y, int width, int height, String path) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.path = path;
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D graph = (Graphics2D) g;

        ImageIcon imageIcon = new ImageIcon(this.path);
        Image image = imageIcon.getImage();

        graph.drawImage(image, this.x, this.y, this.width, this.height, null);
    }

    public void render() {
        Thread animationThread = new Thread(new Runnable() {
            public void run() {
                repaint();
            }
        });

        animationThread.start();
    }
}