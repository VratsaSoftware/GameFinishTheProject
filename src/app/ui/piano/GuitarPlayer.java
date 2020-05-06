package app.ui.piano;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.File;

public class GuitarPlayer extends Player {

    public GuitarPlayer() {
        super("GuitarPlayer", 6,Color.BLUE);
    }

    @Override
    protected void playSoundWhenButtonPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_1) {
            Sound.playSound(new File("src\\sound\\Guitar01.wav"));
        } else if (e.getKeyCode() == KeyEvent.VK_2) {
            Sound.playSound(new File("src\\sound\\Guitar02.wav"));
        } else if (e.getKeyCode() == KeyEvent.VK_3) {
            Sound.playSound(new File("src\\sound\\Guitar03.wav"));
        } else if (e.getKeyCode() == KeyEvent.VK_4) {
            Sound.playSound(new File("src\\sound\\Guitar04.wav"));
        } else if (e.getKeyCode() == KeyEvent.VK_5) {
            Sound.playSound(new File("src\\sound\\Guitar05.wav"));
        } else if (e.getKeyCode() == KeyEvent.VK_6) {
            Sound.playSound(new File("src\\sound\\Guitar06.wav"));
        }
    }

    @Override
    protected void playSoundWhenMousePressedPanel(MouseEvent e) {
        if (isInRangeForCertainNote(e, 0, 190)) {
            Sound.playSound(new File("src\\sound\\Guitar01.wav"));
        } else if (isInRangeForCertainNote(e, 200, 390)) {
            Sound.playSound(new File("src\\sound\\Guitar02.wav"));
        } else if (isInRangeForCertainNote(e, 400, 590)) {
            Sound.playSound(new File("src\\sound\\Guitar03.wav"));
        } else if (isInRangeForCertainNote(e, 600, 790)) {
            Sound.playSound(new File("src\\sound\\Guitar04.wav"));
        } else if (isInRangeForCertainNote(e, 800, 990)) {
            Sound.playSound(new File("src\\sound\\Guitar05.wav"));
        } else if (isInRangeForCertainNote(e, 1000, 1200)) {
            Sound.playSound(new File("src\\sound\\Guitar06.wav"));
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
}
