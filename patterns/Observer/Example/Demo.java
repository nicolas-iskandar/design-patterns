package Observer.Example;

public class Demo {
    public static void show() {
        ConcreteKitchen kitchen = new ConcreteKitchen();

        Waiter waiter1 = new Waiter("Alice");
        Waiter waiter2 = new Waiter("Bob");

        kitchen.addObserver(waiter1);
        kitchen.addObserver(waiter2);

        kitchen.prepareOrder("Spaghetti Carbonara");
        kitchen.prepareOrder("Margherita Pizza");
    }
}
