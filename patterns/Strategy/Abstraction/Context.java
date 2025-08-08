package Strategy.Abstraction;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    void doSomething() {
        if (strategy == null) return;
        strategy.execute();
    }
}
