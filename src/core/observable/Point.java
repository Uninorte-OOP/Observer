package core.observable;

/**
 *
 * @author edangulo
 */
public class Point extends Observable {
    
    private int x;
    private int y;

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
        this.notifyAll(x);
    }

    public void setY(int y) {
        this.y = y;
        this.notifyAll(y);
    }
    
}
