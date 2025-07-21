package AbstractFactory.Example.Factories;

import AbstractFactory.Example.Dessert;
import AbstractFactory.Example.Drink;
import AbstractFactory.Example.MainDish;

public interface MealKitFactory {
    MainDish createMainDish();
    Dessert createDessert();
    Drink createDrink();
}
