/**
 * Created by Bryan1 on 2/9/18.
 */

public class AdapterPatternDemo {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "songtitle.mp3");
        audioPlayer.play("mp4", "TWICE \"CHEER UP\" M/V");
        audioPlayer.play("vlc", "I_don't_even_know_what_a_vlc_format_is.vlc");
        audioPlayer.play("mp3", "Baek_A_Yeon_SoSo");
    }
}
