/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.Polygon;
import core.observable.Point;
import core.observer.Adder;
import core.observer.Multiplier;

/**
 *
 * @author jdecaro
 */
public class Main {
    
    public static void main(String[] args) {
        // Create polygon
        Polygon polygon1 = new Polygon();
        
        // Add points to polygon
        polygon1.addPoint(new Point(0, 0));
        polygon1.addPoint(new Point(5, 10));
        polygon1.addPoint(new Point(4, 9));
        polygon1.addPoint(new Point(10, 12));
        polygon1.addPoint(new Point(0, 0));
        polygon1.addPoint(new Point(0, 0));
        
        // Add observers to points
        polygon1.getPoint(0).addObserver(new Adder(4));
        polygon1.getPoint(0).addObserver(new Multiplier(2));
        polygon1.getPoint(0).addObserver(new Adder(17));
        polygon1.getPoint(0).addObserver(new Adder(159));
        polygon1.getPoint(0).addObserver(new Multiplier(5));
        
        // Update attribute values (should notify all observators)
        polygon1.getPoint(0).setX(3);
        polygon1.getPoint(0).setY(14);
        polygon1.getPoint(0).setX(9);
        polygon1.getPoint(0).setX(82);
        polygon1.getPoint(0).setY(1876);
    }
    
}
