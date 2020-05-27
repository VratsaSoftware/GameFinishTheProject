package app.ui.players;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Collection;

public class GuitarPlayer extends Player {

    public GuitarPlayer() {
        super("Guitar Player", 6,Color.BLUE);
    }

    @Override
    protected void playSoundWhenButtonPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_1) {
            Sound.playSound(new File("src\\app\\sound\\Guitar01.wav"));
        } else if (e.getKeyCode() == KeyEvent.VK_2) {
            Sound.playSound(new File("src\\app\\sound\\Guitar02.wav"));
        } else if (e.getKeyCode() == KeyEvent.VK_3) {
            Sound.playSound(new File("src\\app\\sound\\Guitar03.wav"));
        } else if (e.getKeyCode() == KeyEvent.VK_4) {
            Sound.playSound(new File("src\\app\\sound\\Guitar04.wav"));
        } else if (e.getKeyCode() == KeyEvent.VK_5) {
            Sound.playSound(new File("src\\app\\sound\\Guitar05.wav"));
        } else if (e.getKeyCode() == KeyEvent.VK_6) {
            Sound.playSound(new File("src\\app\\sound\\Guitar06.wav"));
        }
    }

    @Override
    protected void playSoundWhenMousePressedPanel(MouseEvent e) {
        if (isInRangeForCertainNote(e, 0, 190)) {
            Sound.playSound(new File("src\\app\\sound\\Guitar01.wav"));
        } else if (isInRangeForCertainNote(e, 200, 390)) {
            Sound.playSound(new File("src\\app\\sound\\Guitar02.wav"));
        } else if (isInRangeForCertainNote(e, 400, 590)) {
            Sound.playSound(new File("src\\app\\sound\\Guitar03.wav"));
        } else if (isInRangeForCertainNote(e, 600, 790)) {
            Sound.playSound(new File("src\\app\\sound\\Guitar04.wav"));
        } else if (isInRangeForCertainNote(e, 800, 990)) {
            Sound.playSound(new File("src\\app\\sound\\Guitar05.wav"));
        } else if (isInRangeForCertainNote(e, 1000, 1200)) {
            Sound.playSound(new File("src\\app\\sound\\Guitar06.wav"));
        }
    }

    @Override
    protected void changeColorOfTheNotes(KeyEvent e, Color color) {
        if (e.getKeyCode() == KeyEvent.VK_1) {
            notesLayout[0].setBackground(color);
        } else if (e.getKeyCode() == KeyEvent.VK_2) {
            notesLayout[1].setBackground(color);
        } else if (e.getKeyCode() == KeyEvent.VK_3) {
            notesLayout[2].setBackground(color);
        } else if (e.getKeyCode() == KeyEvent.VK_4) {
            notesLayout[3].setBackground(color);
        } else if (e.getKeyCode() == KeyEvent.VK_5) {
            notesLayout[4].setBackground(color);
        } else if (e.getKeyCode() == KeyEvent.VK_6) {
            notesLayout[5].setBackground(color);

        }
    }

    @Override
    protected void changeColorOfButtons(MouseEvent m, Color color) {
        if (isInRangeForCertainNote(m, 0, 190)) {
            notesLayout[0].setBackground(color);
        } else if (isInRangeForCertainNote(m, 200, 390)) {
            notesLayout[1].setBackground(color);
        } else if (isInRangeForCertainNote(m, 400, 590)) {
            notesLayout[2].setBackground(color);
        } else if (isInRangeForCertainNote(m, 600, 790)) {
            notesLayout[3].setBackground(color);
        } else if (isInRangeForCertainNote(m, 800, 990)) {
            notesLayout[4].setBackground(color);
        } else if (isInRangeForCertainNote(m, 1000, 1200)) {
            notesLayout[5].setBackground(color);
        }
    }

}
