package Decorator.Example;

public class BasicCoffee implements Drink {
    @Override
    public void prepare() {
        System.out.println("Brewing basic black coffee");
    }
}
