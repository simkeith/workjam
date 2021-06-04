package designPatterns.structural.adapter;

/**
 * Plays only MP4 audio files
 *
 * @author Simar Preet
 */
public class MP4Player implements AdvancedMediaPlayer{
    @Override
    public void playMP4(String audioFile) {
        System.out.println("Playing MP4... "+ audioFile);
    }

    @Override
    public void playVLC(String audioFile) {
        //DO NOTHING
    }
}
