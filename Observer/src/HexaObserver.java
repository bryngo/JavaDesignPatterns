/**
 * Created by Bryan1 on 2/8/18.
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {

        this._subject = subject;
        subject.attach(this);
        System.out.println("HexaObserver is now attached!");

    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( this._subject.getState() ).toUpperCase() );
    }
}
