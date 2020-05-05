package app.ui.piano;

import javafx.scene.media.AudioClip;

import javax.sound.sampled.*;
import java.io.*;

public class Sound {

    public static void playSound(File filePath) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        Clip clip;
        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(filePath));
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
