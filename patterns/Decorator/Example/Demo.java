package Decorator.Example;

public class Demo {
    public static void show() {
        Drink drink = new BasicCoffee();
        drink = new MilkDecorator(drink);
        drink = new SugarDecorator(drink);
        drink = new WhippedCreamDecorator(drink);

        drink.prepare();
    }
}
