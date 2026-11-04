/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.base.observers.ConcreteObserverA;
import core.base.observers.ConcreteObserverB;
import core.base.observers.ConcreteObserverC;
import core.base.observers.Observer;
import core.base.subjects.ConcreteSubject;

/**
 *
 * @author edangulo
 */
public class Main {
    
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        
        Observer observerA = new ConcreteObserverA();
        Observer observerB = new ConcreteObserverB();
        Observer observerC = new ConcreteObserverC();
        
        subject.attach(observerA);
        subject.attach(observerB);
        subject.attach(observerA);
        
        subject.setState("New State");
        subject.setState("Another State");
        
        subject.attach(observerC);
        subject.setState("State for test");
        
        subject.detach(observerB);
        subject.setState("Remove State");
    }
    
}
