package Decorator.Example;

public class DrinkDecorator implements Drink {
    protected final Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public void prepare() {
        drink.prepare();
    }
}
