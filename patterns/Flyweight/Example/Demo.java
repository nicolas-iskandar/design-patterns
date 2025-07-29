package Flyweight.Example;

public class Demo {
    public static void show() {
        Topping cheese = ToppingFactory.getTopping("Mozzarella", 80, 0.5);
        Topping pepperoni = ToppingFactory.getTopping("Pepperoni", 100, 0.75);

        Pizza pizza1 = new Pizza("Large");
        pizza1.addTopping(new ToppingPortion(cheese, 2, "whole", ""));
        pizza1.addTopping(new ToppingPortion(pepperoni, 3, "left side", "extra crispy"));

        Pizza pizza2 = new Pizza("Medium");
        pizza2.addTopping(new ToppingPortion(cheese, 1, "whole", "light"));
        pizza2.addTopping(new ToppingPortion(pepperoni, 2, "right side", ""));

        pizza1.describe();
        pizza2.describe();
    }
}
