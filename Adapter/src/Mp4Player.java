/**
 * Created by Bryan1 on 2/9/18.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        // do nothing
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing " + fileName + " from MP4 adapter");
    }
}
