/**
 * Created by Bryan1 on 2/9/18.
 */
public class AudioPlayer implements MediaPlayer {

    // we have an adapter if we need it
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        } else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {

            // make a new adapter for type `audioType`
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Format type: " + audioType + " not supported. Sorry!");
        }

    }
}
