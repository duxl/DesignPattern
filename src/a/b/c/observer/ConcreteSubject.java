package a.b.c.observer;

import java.util.Observable;

// 目标可观察对象
public class ConcreteSubject extends Observable {

    private int state;

    public int getState() {
        return state;
    }

    public void set(int s) {
        state = s;
        setChanged(); // 表示目标对象以及做了更改
        notifyObservers(state); // 通知所有观察者
    }
}
