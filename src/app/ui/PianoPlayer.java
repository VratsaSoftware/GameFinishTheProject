package app.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class PianoPlayer extends JFrame {
    JPanel[] notesLayout;
    Container noteContainer;

    public PianoPlayer() {
        super("Piano player");
        setBounds(0, 300, 1200, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        noteContainer = getContentPane();
        noteContainer.setLayout(new GridLayout(1, 0, 10, 10));
        noteContainer.setBackground(Color.BLACK);
        notesLayout = new JPanel[8];
        for (int i = 0; i < notesLayout.length; i++) {
            notesLayout[i] = new JPanel();
            notesLayout[i].setBackground(Color.WHITE);
            noteContainer.add(notesLayout[i]);
        }
        addKeyListener(new KeyListener(){
            @Override
            public void keyPressed(KeyEvent e){
                try {
                    playSound(e);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            @Override
            public void keyReleased(KeyEvent e) { }
            // unused
            @Override
            public void keyTyped(KeyEvent e) { }
            // unused
        });
        noteContainer.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    playSound(e);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });


    }

    private void playSound(KeyEvent e) throws Exception{
        if (e.getKeyCode()==KeyEvent.VK_1) {
            Sound.playSound(new File("src\\sound\\do-stretched.wav"));
        } else if (e.getKeyCode()==KeyEvent.VK_2) {
            Sound.playSound(new File("src\\sound\\re-stretched.wav"));
        } else if (e.getKeyCode()==KeyEvent.VK_3) {
            Sound.playSound(new File("src\\sound\\mi-stretched.wav"));
        } else if (e.getKeyCode()==KeyEvent.VK_4) {
            Sound.playSound(new File("src\\sound\\fa-stretched.wav"));
        } else if (e.getKeyCode()==KeyEvent.VK_5) {
            Sound.playSound(new File("src\\sound\\sol-stretched.wav"));
        } else if (e.getKeyCode()==KeyEvent.VK_6) {
            Sound.playSound(new File("src\\sound\\la-stretched.wav"));
        } else if (e.getKeyCode()==KeyEvent.VK_7) {
            Sound.playSound(new File("src\\sound\\si-stretched.wav"));
        } else if (e.getKeyCode()==KeyEvent.VK_8) {
            Sound.playSound(new File("src\\sound\\do-stretched-octave.wav"));
        }
    }

    private void playSound(MouseEvent e) throws Exception {
        if (isInRangeForCertainNote(e, 0, 140)) {
            Sound.playSound(new File("src\\sound\\do-stretched.wav"));
        } else if (isInRangeForCertainNote(e, 150, 290)) {
            Sound.playSound(new File("src\\sound\\re-stretched.wav"));
        } else if (isInRangeForCertainNote(e, 300, 440)) {
            Sound.playSound(new File("src\\sound\\mi-stretched.wav"));
        } else if (isInRangeForCertainNote(e, 450, 590)) {
            Sound.playSound(new File("src\\sound\\fa-stretched.wav"));
        } else if (isInRangeForCertainNote(e, 600, 740)) {
            Sound.playSound(new File("src\\sound\\sol-stretched.wav"));
        } else if (isInRangeForCertainNote(e, 750, 890)) {
            Sound.playSound(new File("src\\sound\\la-stretched.wav"));
        } else if (isInRangeForCertainNote(e, 900, 1040)) {
            Sound.playSound(new File("src\\sound\\si-stretched.wav"));
        } else if (isInRangeForCertainNote(e, 1050, 1190)) {
            Sound.playSound(new File("src\\sound\\do-stretched-octave.wav"));
        }
    }

    private boolean isInRangeForCertainNote(MouseEvent e, int xStart, int xEnd) {
        return e.getX() >= xStart && e.getX() <= xEnd;
    }


}
