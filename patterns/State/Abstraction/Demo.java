package State.Abstraction;

public class Demo {
    public static void show() {
        Context context = new Context(new ConcreteState1());

        context.doThis();
        context.doThis();

        context.doThat();
        context.doThat();
    }
}
