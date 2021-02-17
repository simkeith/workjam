package designPatterns.structural.adapter;

/**
 * Class that plays audio in any format. It makes use of the Adapter class in order to use functionality of AdvancedMediaPlayer
 *
 * @author Simar Preet
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String audioFile) {
        if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, audioFile);
        } else
            System.out.println("playing "+ audioType + " file " + audioFile);
    }
}
