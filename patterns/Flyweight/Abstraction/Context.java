package Flyweight.Abstraction;

public class Context {
    private final String uniqueState;
    private final Flyweight flyweight;

    public Context(String repeatingState, String uniqueState) {
        this.uniqueState = uniqueState;
        this.flyweight = FlyweightFactory.getFlyweight(repeatingState);
    }

    public void operation() {
        flyweight.operation(uniqueState);
    }
}
