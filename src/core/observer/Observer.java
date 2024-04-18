/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.observer;

import core.observable.Observable;

/**
 *
 * @author jdecaro
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
