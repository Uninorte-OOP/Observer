/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.base.observers;

/**
 *
 * @author edangulo
 */
public class ConcreteObserverB implements Observer {

    @Override
    public void update(String message) {
        System.out.println("ObserverB received: " + message);
    }
    
}
