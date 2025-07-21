package AbstractFactory.Example.Factories;

import AbstractFactory.Example.Dessert;
import AbstractFactory.Example.Drink;
import AbstractFactory.Example.MainDish;
import AbstractFactory.Example.MexicanMealKit.Churros;
import AbstractFactory.Example.MexicanMealKit.Horchata;
import AbstractFactory.Example.MexicanMealKit.Tacos;

public class MexicanMealKitFactory implements MealKitFactory {
    @Override
    public MainDish createMainDish() {
        return new Tacos();
    }

    @Override
    public Dessert createDessert() {
        return new Churros();
    }

    @Override
    public Drink createDrink() {
        return new Horchata();
    }
}
