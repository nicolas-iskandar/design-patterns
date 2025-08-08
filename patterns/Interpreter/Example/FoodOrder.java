package Interpreter.Example;

import java.util.List;

public class FoodOrder implements OrderExpression {
    private final List<OrderExpression> items;

    public FoodOrder(List<OrderExpression> items) {
        this.items = items;
    }

    @Override
    public void interpret() {
        System.out.println("Interpreting full food order:");
        for (OrderExpression item : items) {
            item.interpret();
        }
    }
}
