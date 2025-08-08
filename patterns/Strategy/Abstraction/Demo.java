package Strategy.Abstraction;

public class Demo {
    public static void show() {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategy1());
        context.doSomething();
        context.setStrategy(new ConcreteStrategy2());
        context.doSomething();
    }
}
