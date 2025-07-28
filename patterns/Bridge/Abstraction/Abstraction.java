package Bridge.Abstraction;

public class Abstraction {
    protected final Implementation implementation;

    public Abstraction(Implementation implementation) {
        this.implementation = implementation;
    }

    public void feature() {
        implementation.method();
    }
}
