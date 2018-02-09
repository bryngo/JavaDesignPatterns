import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bryan1 on 2/8/18.
 */
public class Subject {
    private List<Observer> observerList = new ArrayList<Observer>();

    /*
     * In this case, we are using integers to represent cases.
     * Other example of states could be Shelved, Out, Returned, etc, if we're talking about the context
     * of a library book.
     */

    private int _state;

    public int getState() {
        return _state;
    }

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void setState(int state) {

        this._state = state;
        notifyAllObservers();
    }

    public void notifyAllObservers() {

        for(Observer observer : observerList) {
            observer.update();
        }

    }

}
