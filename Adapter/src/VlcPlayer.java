/**
 * Created by Bryan1 on 2/9/18.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing " + fileName + " from VLC adapter");
    }

    @Override
    public void playMP4(String fileName) {
        // do nothing
    }
}
