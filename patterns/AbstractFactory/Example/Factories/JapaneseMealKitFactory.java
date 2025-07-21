package AbstractFactory.Example.Factories;

import AbstractFactory.Example.Dessert;
import AbstractFactory.Example.Drink;
import AbstractFactory.Example.JapaneseMealKit.GreenTea;
import AbstractFactory.Example.JapaneseMealKit.Mochi;
import AbstractFactory.Example.JapaneseMealKit.Sushi;
import AbstractFactory.Example.MainDish;

public class JapaneseMealKitFactory implements MealKitFactory {
    @Override
    public MainDish createMainDish() {
        return new Sushi();
    }

    @Override
    public Dessert createDessert() {
        return new Mochi();
    }

    @Override
    public Drink createDrink() {
        return new GreenTea();
    }
}
