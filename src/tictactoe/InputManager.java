package tictactoe;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class InputManager extends JPanel implements ChangeListener {
    private boolean isMouseRealised = false;
    private boolean pressed = false;

    InputManager() {
        JButton button = new JButton("");
        button.getModel().addChangeListener(this);
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setBounds(0, 0, TestTicTacToe.WIDTH, TestTicTacToe.HEIGHT);
        TestTicTacToe.display.addComponent(button);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        ButtonModel model = (ButtonModel) e.getSource();
        if (model.isPressed() != pressed) {
            pressed = model.isPressed();
            if (!pressed) isMouseRealised = true;
        }
    }

    public void update() {
        int x = (int) MouseInfo.getPointerInfo().getLocation().getX() - TestTicTacToe.display.frame.getLocation().x - 8;
        int y = (int) MouseInfo.getPointerInfo().getLocation().getY() - TestTicTacToe.display.frame.getLocation().y - 30;
        int xIndex = x / ((TestTicTacToe.WIDTH) / 3);
        int yIndex = y / ((TestTicTacToe.HEIGHT) / 3);

        if (pressed) mousePressed(xIndex, yIndex);
        else if (isMouseRealised) mouseReleased();

    }

    private void mousePressed(int xIndex, int yIndex) {
        TestTicTacToe.map.move(xIndex, yIndex);
    }

    private void mouseReleased() {
        isMouseRealised = false;
    }
}
