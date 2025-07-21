package AbstractFactory.Example.Factories;

import AbstractFactory.Example.Dessert;
import AbstractFactory.Example.Drink;
import AbstractFactory.Example.ItalianMealKit.Lasagna;
import AbstractFactory.Example.ItalianMealKit.RedWine;
import AbstractFactory.Example.ItalianMealKit.Tiramisu;
import AbstractFactory.Example.MainDish;

public class ItalianMealKitFactory implements MealKitFactory {
    @Override
    public MainDish createMainDish() {
        return new Lasagna();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }

    @Override
    public Drink createDrink() {
        return new RedWine();
    }
}
