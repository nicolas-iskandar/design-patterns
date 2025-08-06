package Observer.Example;

public class ConcreteKitchen extends Kitchen {
    public void prepareOrder(String order) {
        System.out.println("Kitchen: Preparing order - " + order);
        System.out.println("Kitchen: Order ready - " + order);
        notifyObservers(order);
    }
}
