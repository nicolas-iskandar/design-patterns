package Adapter.Abstraction;

public class Adapter implements ClientInterface {
    private final Service adaptee;

    public Adapter(Service adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void method(int data) {
        adaptee.serviceMethod(String.valueOf(data));
    }
}
