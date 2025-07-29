package Flyweight.Abstraction;

public class Demo {
    public static void show() {
        Context context1 = new Context("SharedA", "Unique1");
        Context context2 = new Context("SharedA", "Unique2");
        Context context3 = new Context("SharedB", "Unique3");

        context1.operation();
        context2.operation();
        context3.operation();
    }
}
