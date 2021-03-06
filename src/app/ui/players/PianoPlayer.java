package app.ui.players;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.File;

public class PianoPlayer extends Player {

    public PianoPlayer() {
        super("Piano Player", 8,Color.RED);

    }

    @Override
    protected void playSoundWhenButtonPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_1) {
            Sound.playSound(new File("src\\app\\sound\\do-stretched.wav"));
        } else if (e.getKeyCode() == KeyEvent.VK_2) {
            Sound.playSound(new File("src\\app\\sound\\re-stretched.wav"));
        } else if (e.getKeyCode() == KeyEvent.VK_3) {
            Sound.playSound(new File("src\\app\\sound\\mi-stretched.wav"));
        } else if (e.getKeyCode() == KeyEvent.VK_4) {
            Sound.playSound(new File("src\\app\\sound\\fa-stretched.wav"));
        } else if (e.getKeyCode() == KeyEvent.VK_5) {
            Sound.playSound(new File("src\\app\\sound\\sol-stretched.wav"));
        } else if (e.getKeyCode() == KeyEvent.VK_6) {
            Sound.playSound(new File("src\\app\\sound\\la-stretched.wav"));
        } else if (e.getKeyCode() == KeyEvent.VK_7) {
            Sound.playSound(new File("src\\app\\sound\\si-stretched.wav"));
        } else if (e.getKeyCode() == KeyEvent.VK_8) {
            Sound.playSound(new File("src\\app\\sound\\do-stretched-octave.wav"));
        }
    }

    @Override
    protected void playSoundWhenMousePressedPanel(MouseEvent e) {
        if (isInRangeForCertainNote(e, 0, 140)) {
            Sound.playSound(new File("src\\app\\sound\\do-stretched.wav"));
        } else if (isInRangeForCertainNote(e, 150, 290)) {
            Sound.playSound(new File("src\\app\\sound\\re-stretched.wav"));
        } else if (isInRangeForCertainNote(e, 300, 440)) {
            Sound.playSound(new File("src\\app\\sound\\mi-stretched.wav"));
        } else if (isInRangeForCertainNote(e, 450, 590)) {
            Sound.playSound(new File("src\\app\\sound\\fa-stretched.wav"));
        } else if (isInRangeForCertainNote(e, 600, 740)) {
            Sound.playSound(new File("src\\app\\sound\\sol-stretched.wav"));
        } else if (isInRangeForCertainNote(e, 750, 890)) {
            Sound.playSound(new File("src\\app\\sound\\la-stretched.wav"));
        } else if (isInRangeForCertainNote(e, 900, 1040)) {
            Sound.playSound(new File("src\\app\\sound\\si-stretched.wav"));
        } else if (isInRangeForCertainNote(e, 1050, 1190)) {
            Sound.playSound(new File("src\\app\\sound\\do-stretched-octave.wav"));
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
        } else if (e.getKeyCode() == KeyEvent.VK_7) {
            notesLayout[6].setBackground(color);
        } else if (e.getKeyCode() == KeyEvent.VK_8) {
            notesLayout[7].setBackground(color);
        }
    }

    @Override
    protected void changeColorOfButtons(MouseEvent m, Color color) {
        if (isInRangeForCertainNote(m, 0, 140)) {
            notesLayout[0].setBackground(color);
        } else if (isInRangeForCertainNote(m, 150, 290)) {
            notesLayout[1].setBackground(color);
        } else if (isInRangeForCertainNote(m, 300, 440)) {
            notesLayout[2].setBackground(color);
        } else if (isInRangeForCertainNote(m, 450, 590)) {
            notesLayout[3].setBackground(color);
        } else if (isInRangeForCertainNote(m, 600, 740)) {
            notesLayout[4].setBackground(color);
        } else if (isInRangeForCertainNote(m, 750, 890)) {
            notesLayout[5].setBackground(color);
        } else if (isInRangeForCertainNote(m, 900, 1040)) {
            notesLayout[6].setBackground(color);
        } else if (isInRangeForCertainNote(m, 1050, 1190)) {
            notesLayout[7].setBackground(color);
        }
    }
}
