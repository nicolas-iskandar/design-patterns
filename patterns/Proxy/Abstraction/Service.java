package Proxy.Abstraction;

public class Service implements ServiceInterface {
    @Override
    public void operation() {
        System.out.println("Service operation");
    }
}
