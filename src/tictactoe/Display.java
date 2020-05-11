package tictactoe;

import javax.swing.*;

public class Display{
    JFrame frame = new JFrame();
    int width;
    int height;

    Display(int widthSize, int heightSize, String name) {
        this.width = widthSize;
        this.height = heightSize;

        frame.setSize(widthSize, heightSize);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setTitle(name);
        frame.setResizable(false);
        frame.setVisible(true);


    }

    public void addGraphic(TextureManager t) {
        frame.add(t);
        frame.setVisible(true);
    }
    public void addComponent(JComponent component) {
        frame.add(component);
    }

    public void removeGraphic(TextureManager t) {
        frame.remove(t);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
