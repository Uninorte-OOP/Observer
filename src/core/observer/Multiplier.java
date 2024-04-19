package core.observer;

/**
 *
 * @author edangulo
 */
public class Multiplier extends Observer {
    
    private int value;
    
    public Multiplier(int value) {
        super();
        this.value = value;
    }

    @Override
    public String toString() {
        return "Multiplier(" + value + ")";
    }
    
    @Override
    public void notify(int value) {
        System.out.println("Updated attribute in " + this.observable + ", executing multiplication... result = " + this.multiply(value));
    }
    
    private int multiply(int value) {
        return this.value * value;
    }
    
}
