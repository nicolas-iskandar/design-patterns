package Facade.Abstraction;

public class Demo {
    public static void show() {
        Facade facade = new Facade(new SubsystemClass2());
        facade.operation();
    }
}
