package Bridge.Abstraction;

public class Demo {
    public static void show() {
        Abstraction abstraction = new RefinedAbstraction(new ConcreteImplementation());
        abstraction.feature();
    }
}
