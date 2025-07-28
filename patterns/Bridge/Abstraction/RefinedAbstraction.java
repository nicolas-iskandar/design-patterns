package Bridge.Abstraction;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementation implementation) {
        super(implementation);
    }

    @Override
    public void feature() {
        System.out.println("Refined Feature");
        implementation.method();
    }
}
