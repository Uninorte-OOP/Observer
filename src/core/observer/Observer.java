package core.observer;

import core.observable.Observable;

/**
 *
 * @author edangulo
 */
public abstract class Observer {
    
    protected Observable observable;

    public Observer() {
        this.observable = null;
    }
    
    public abstract void notify(int value);
    
    public void setObservable(Observable observable) {
        this.observable = observable;
    }
    
}
