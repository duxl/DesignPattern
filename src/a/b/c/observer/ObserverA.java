package a.b.c.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer {

    private int myState;

    @Override
    public void update(Observable observable, Object o) {
        myState = ((ConcreteSubject) observable).getState();
    }

    public int getMyState() {
        return myState;
    }
}
