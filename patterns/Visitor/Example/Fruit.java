package Visitor.Example;

public class Fruit implements FoodItem {
    private final String name;
    private final int calories;

    public Fruit(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public void accept(FoodVisitor visitor) {
        visitor.visit(this);
    }
}
