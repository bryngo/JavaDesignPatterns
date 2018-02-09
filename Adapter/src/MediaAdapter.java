/**
 * Created by Bryan1 on 2/9/18.
 */
public class MediaAdapter implements MediaPlayer {

    // used if our media player receives an unsupported format
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {

        if(audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVLC(fileName);
        } else if(audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMP4(fileName);
        }
    }
}
