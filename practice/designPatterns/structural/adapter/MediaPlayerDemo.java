package designPatterns.structural.adapter;

/**
 * Demo the usage of adapter pattern
 * We are only using one class to play all types of audio files. The AudioPlayer here is responsible for playing medias of all types.
 *
 * @author Simar Preet
 */
public class MediaPlayerDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "way to go.mp3");
        audioPlayer.play("VLC", "another day.vlc" );
        audioPlayer.play("MP4", "coldplay.MP4");
        audioPlayer.play("avi", "mind me.avi");
    }
}
