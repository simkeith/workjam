package designPatterns.structural.adapter;

/**
 * Interface for playing audio in other formats like VLC, MP4
 *
 * @author Simar Preet
 */
public interface AdvancedMediaPlayer {
    public void playVLC(String audioFile);
    public void playMP4(String audioFile);
}
