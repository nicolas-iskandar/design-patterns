package Interpreter.Example;

public class FoodItem implements OrderExpression {
    private final String name;

    public FoodItem(String name) {
        this.name = name;
    }

    @Override
    public void interpret() {
        System.out.println("Food item ordered: " + name);
    }
}
