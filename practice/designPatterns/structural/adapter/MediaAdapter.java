package designPatterns.structural.adapter;

/**
 * Adapter class that connects two incompatible interfaces
 * (In this case, AdvancedMediaPlayer and MediaPlayer)
 *
 * @author Simar Preet
 */
public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;


    public MediaAdapter(String audioType) {
            if(audioType.equals("VLC")){
                advancedMediaPlayer = new VLCPlayer();
            }else{
                advancedMediaPlayer = new MP4Player();
            }
    }

    @Override
    public void play(String audioType, String audioFile){
        if(audioType.equals("VLC")){
            advancedMediaPlayer.playVLC(audioFile);
        }else{
            advancedMediaPlayer.playMP4(audioFile);
        }
    }
}
