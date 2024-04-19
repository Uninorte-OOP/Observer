package core;

import core.observable.Point;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class Polygon {
    
    private ArrayList<Point> points;

    public Polygon() {
        this.points = new ArrayList<>();
        System.out.println("Polygon created...\n");
    }
    
    public boolean addPoint(Point point) {
        this.points.add(point);
        System.out.println(point + " added to polygon");
        return true;
    }
    
    public Point getPoint(int index) {
        return this.points.get(index);
    }
    
    private double distance(Point p1, Point p2) {
        double x_comp = Math.pow(p2.getX() - p1.getX(), 2);
        double y_comp = Math.pow(p2.getY() - p1.getY(), 2);
        return Math.sqrt(x_comp + y_comp);
    }
    
    public double getPerimeter() {
        int n = this.points.size();
        
        double perimeter = 0.0;
        for (int i = 0; i < n; i++) {
            perimeter += this.distance(this.points.get(i % n), this.points.get((i + 1) % n));
        }
        return perimeter;
    }
    
    public void summary() {
        System.out.println("\nPolygon summary:");
        System.out.println("- Number of points: " + this.points.size());
        System.out.println("- Final points:");
        for (Point point : this.points) {
            System.out.println("  - " + point);
        }
        System.out.println("");
    }
    
}
