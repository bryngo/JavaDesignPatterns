/**
 * Created by Bryan1 on 2/8/18.
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new BinaryObserver(subject);
        new OctalObserver(subject);


        System.out.println("Changing state to 4...");
        subject.setState(4);

        System.out.println("Changing state to 2048");
        subject.setState(2048);


    }

}
