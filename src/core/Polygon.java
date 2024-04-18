/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.observable.Point;
import java.util.ArrayList;

/**
 *
 * @author jdecaro
 */
public class Polygon {
    
    private ArrayList<Point> points;

    public Polygon() {
        this.points = new ArrayList<>();
    }
    
    public boolean addPoint(Point point) {
        this.points.add(point);
        return true;
    }
    
    public Point getPoint(int index) {
        return this.points.get(index);
    }
    
    public double getPerimeter() {
        return 0.0;
    }
    
}
