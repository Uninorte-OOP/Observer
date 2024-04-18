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
        Polygon polygon = new Polygon();
        
        // Add points to polygon
        polygon.addPoint(new Point(0, 0));
        polygon.addPoint(new Point(5, 10));
        polygon.addPoint(new Point(4, 9));
        polygon.addPoint(new Point(10, 12));
        polygon.addPoint(new Point(30, 841));
        polygon.addPoint(new Point(947, 1947));
        
        // Add observers to points
        polygon.getPoint(0).addObserver(new Adder(4));
        polygon.getPoint(0).addObserver(new Multiplier(2));
        polygon.getPoint(0).addObserver(new Adder(17));
        polygon.getPoint(0).addObserver(new Adder(159));
        polygon.getPoint(0).addObserver(new Multiplier(5));
        
        polygon.getPoint(1).addObserver(new Adder(87));
        polygon.getPoint(1).addObserver(new Multiplier(203));
        
        polygon.getPoint(2).addObserver(new Adder(9841));
        polygon.getPoint(2).addObserver(new Multiplier(24));
        
        polygon.getPoint(3).addObserver(new Adder(3746));
        polygon.getPoint(3).addObserver(new Multiplier(497));
        
        polygon.getPoint(4).addObserver(new Adder(358));
        polygon.getPoint(4).addObserver(new Multiplier(72));
        
        polygon.getPoint(5).addObserver(new Adder(972));
        polygon.getPoint(5).addObserver(new Multiplier(3795));
        
        // Update attribute values (should notify all observators)
        polygon.getPoint(0).setX(3);
        polygon.getPoint(0).setY(14);
        polygon.getPoint(0).setX(9);
        polygon.getPoint(0).setX(82);
        polygon.getPoint(0).setY(1876);
        
        polygon.getPoint(1).setX(3);
        polygon.getPoint(1).setY(14);
        
        polygon.getPoint(2).setX(3);
        polygon.getPoint(2).setY(14);
        
        polygon.getPoint(3).setX(3);
        polygon.getPoint(3).setY(14);
        
        polygon.getPoint(4).setX(3);
        polygon.getPoint(4).setY(14);
        
        polygon.getPoint(5).setX(3);
        polygon.getPoint(5).setY(14);
        
        // Obtain perimeter of polygon
        System.out.println("The perimeter of the polygon is " + String.format("%.2f", polygon.getPerimeter()));
    }
    
}
