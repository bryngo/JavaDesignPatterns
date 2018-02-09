/**
 * Created by Bryan1 on 2/8/18.
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {

        this._subject = subject;
        subject.attach(this);
        System.out.println("BinaryObserver is now attached!");
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( this._subject.getState() ) );

    }
}
