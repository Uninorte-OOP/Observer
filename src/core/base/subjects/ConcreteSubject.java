/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.base.subjects;

import core.base.observers.Observer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edangulo
 */
public class ConcreteSubject implements Subject {
    
    private List<Observer> observers;
    private String state;

    public ConcreteSubject() {
        this.observers = new ArrayList<>();
    }
    
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(state);
        }
    }

    public void setState(String state) {
        this.state = state;
        this.notifyObservers();
    }
    
}
