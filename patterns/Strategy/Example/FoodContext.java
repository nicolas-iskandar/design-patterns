package Strategy.Example;

public class FoodContext {
    private CookingStrategy strategy;

    public void setStrategy(CookingStrategy strategy) {
        this.strategy = strategy;
    }

    public void prepareFood() {
        if (strategy == null) {
            System.out.println("No cooking strategy selected.");
            return;
        }
        strategy.cook();
    }
}
