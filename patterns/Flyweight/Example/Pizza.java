package Flyweight.Example;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final String size;
    private final List<ToppingPortion> toppings = new ArrayList<>();

    public Pizza(String size) {
        this.size = size;
    }

    public void addTopping(ToppingPortion portion) {
        toppings.add(portion);
    }

    public void describe() {
        System.out.println("\nPizza (" + size + "):");
        for (ToppingPortion tp : toppings) {
            System.out.println(" - " + tp.describe());
        }
    }
}
