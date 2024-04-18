/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.observer;

/**
 *
 * @author jdecaro
 */
public class Multiplier extends Observer {
    
    private int value;
    
    public Multiplier(int value) {
        super();
        this.value = value;
    }

    @Override
    public void notify(int value) {
        System.out.println("Updated attribute in " + this.observable + ", executing multiplication... result = " + this.multiply(value));
    }
    
    private int multiply(int value) {
        return this.value * value;
    }
    
}
