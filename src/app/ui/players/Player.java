package app.ui.players;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public abstract class Player extends JFrame {
    protected JPanel[] notesLayout;
    private Container noteContainer;

    public Player(String name, int keyCount, Color color) {
        super(name);
        setBounds(0, 300, 1200, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        noteContainer = getContentPane();
        noteContainer.setLayout(new GridLayout(1, 0, 10, 10));
        noteContainer.setBackground(Color.BLACK);
        notesLayout = new JPanel[keyCount];
        for (int i = 0; i < notesLayout.length; i++) {
            notesLayout[i] = new JPanel();
            notesLayout[i].setBackground(Color.WHITE);
            noteContainer.add(notesLayout[i]);
        }
        addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                try {
                    playSoundWhenButtonPressed(e);
                    changeColorOfTheNotes(e, color);

                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                changeColorOfTheNotes(e, Color.WHITE);
            }

            // unused
            @Override
            public void keyTyped(KeyEvent e) {
            }
            // unused
        });
        noteContainer.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                try {
                    playSoundWhenMousePressedPanel(e);
                    changeColorOfButtons(e, color);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                changeColorOfButtons(e, Color.WHITE);
            }
        });
    }

    protected abstract void playSoundWhenButtonPressed(KeyEvent e);

    protected abstract void playSoundWhenMousePressedPanel(MouseEvent e);

    protected abstract void changeColorOfTheNotes(KeyEvent e, Color color);

    protected abstract void changeColorOfButtons(MouseEvent m, Color color);

    protected boolean isInRangeForCertainNote(MouseEvent e, int xStart, int xEnd) {
        return e.getX() >= xStart && e.getX() <= xEnd;
    }
}
