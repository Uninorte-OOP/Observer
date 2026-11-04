/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package core.base.subjects;

import core.base.observers.Observer;

/**
 *
 * @author edangulo
 */
public interface Subject {
    
    public abstract void attach(Observer observer);
    public abstract void detach(Observer observer);
    public abstract void notifyObservers();
    
}
