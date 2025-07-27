package Decorator.Example;

public class MilkDecorator extends DrinkDecorator {
    public MilkDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Adding Milk");
    }
}
