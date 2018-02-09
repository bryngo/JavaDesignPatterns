/**
 * Created by Bryan1 on 2/8/18.
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this._subject = subject;
        subject.attach(this);
        System.out.println("Octal observer is now attached!");
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( this._subject.getState() ) );
    }
}
