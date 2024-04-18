/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.observer;

/**
 *
 * @author jdecaro
 */
public class Adder extends Observer {
    
    private int value;

    public Adder(int value) {
        super();
        this.value = value;
    }

    @Override
    public void notify(int value) {
        
    }
    
}
