package Decorator.Example;

public class SugarDecorator extends DrinkDecorator {
    public SugarDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Adding sugar");
    }
}
