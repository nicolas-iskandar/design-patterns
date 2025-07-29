package Flyweight.Example;

import java.util.HashMap;
import java.util.Map;

public class ToppingFactory {
    private static final Map<String, Topping> toppings = new HashMap<>();

    public static Topping getTopping(String name, int caloriesPerUnit, double pricePerUnit) {
        if (!toppings.containsKey(name)) {
            toppings.put(name, new Topping(name, caloriesPerUnit, pricePerUnit));
        }
        return toppings.get(name);
    }
}
