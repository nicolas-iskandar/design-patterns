package Adapter.Abstraction;

public class Demo {
    public static void show() {
        ClientInterface clientInterface = new Adapter(new Service());
        clientInterface.method(10);
    }
}
