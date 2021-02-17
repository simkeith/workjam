package designPatterns.structural.adapter;

/**
 * Interface for playing audio of any type
 *
 * @author Simar Preet
 */
public interface MediaPlayer {
    public void play(String audioType, String audioFile);
}
