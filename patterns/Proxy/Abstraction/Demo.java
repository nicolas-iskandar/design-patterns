package Proxy.Abstraction;

public class Demo {
    public static void show() {
        ServiceInterface service = new Proxy(new Service());
        service.operation();
    }
}
