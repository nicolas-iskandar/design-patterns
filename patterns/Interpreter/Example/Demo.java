package Interpreter.Example;

import java.util.Arrays;

public class Demo {
    public static void show() {
        FoodItem apple = new FoodItem("Apple");
        FoodItem steak = new FoodItem("Steak");

        FoodOrder fullOrder = new FoodOrder(Arrays.asList(apple, steak));

        System.out.println("Interpreting single food items:");
        apple.interpret();
        steak.interpret();

        System.out.println("\nInterpreting combined food order:");
        fullOrder.interpret();
    }
}
