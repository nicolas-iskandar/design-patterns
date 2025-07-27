package Decorator.Example;

public class WhippedCreamDecorator extends DrinkDecorator {
    public WhippedCreamDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Adding whipped cream");
    }
}
