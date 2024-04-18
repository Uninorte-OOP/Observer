/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.observable;

import core.observer.Observer;
import java.util.ArrayList;

/**
 *
 * @author jdecaro
 */
public abstract class Observable {
    
    protected ArrayList<Observer> observers;

    public Observable() {
        this.observers = new ArrayList<>();
    }
    
    public void notifyAll(int value) {
        for (Observer observer : this.observers) {
            observer.notify(value);
        }
    }
    
}
