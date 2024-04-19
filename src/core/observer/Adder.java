package core.observer;

/**
 *
 * @author edangulo
 */
public class Adder extends Observer {
    
    private int value;

    public Adder(int value) {
        super();
        this.value = value;
    }

    @Override
    public String toString() {
        return "Adder(" + value + ")";
    }
    
    @Override
    public void notify(int value) {
        System.out.println("Updated attribute in " + this.observable + ", executing addition... result = " + this.add(value));
    }
    
    private int add(int value) {
        return this.value + value;
    }
    
}
