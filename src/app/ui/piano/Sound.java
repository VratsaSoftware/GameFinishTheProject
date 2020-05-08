package app.ui.piano;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Sound {

    public static void playSound(File filePath) {
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
