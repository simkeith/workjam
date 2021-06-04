package designPatterns.structural.adapter;

/**
 * Plays only VLC audio files
 *
 * @author Simar Preet
 */
public class VLCPlayer implements AdvancedMediaPlayer {

    @Override
    public void playMP4(String audioFile) {
        //do nothing
    }

    @Override
    public void playVLC(String audioFile) {
        System.out.println("playing VLC ... "+ audioFile);
    }
}
