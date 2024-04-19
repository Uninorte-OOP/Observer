package core.observable;

import core.observer.Observer;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public abstract class Observable {
    
    protected ArrayList<Observer> observers;

    public Observable() {
        this.observers = new ArrayList<>();
    }
    
    public boolean addObserver(Observer observer) {
        this.observers.add(observer);
        observer.setObservable(this);
        System.out.println(observer + " is observing " + this);
        return true;
    }
    
    protected void notifyAll(int value) {
        for (Observer observer : this.observers) {
            observer.notify(value);
        }
    }
    
}
