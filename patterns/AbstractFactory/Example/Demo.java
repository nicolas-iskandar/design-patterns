package AbstractFactory.Example;

import AbstractFactory.Example.Factories.ItalianMealKitFactory;
import AbstractFactory.Example.Factories.JapaneseMealKitFactory;
import AbstractFactory.Example.Factories.MealKitFactory;
import AbstractFactory.Example.Factories.MexicanMealKitFactory;

public class Demo {
    public static void show() {
        MealKitFactory factory = new MexicanMealKitFactory(); // choose the Meal Kit Factory that you want

        MainDish mainDish = factory.createMainDish();
        Dessert dessert = factory.createDessert();
        Drink drink = factory.createDrink();

        System.out.println("🍱 Your International Meal Kit Is Ready!\n");

        mainDish.serveMainDish();
        System.out.println(mainDish.describeMainDish());
        System.out.println();

        drink.serveDrink();
        System.out.println(drink.describeDrink());
        System.out.println();

        dessert.serveDessert();
        System.out.println(dessert.describeDessert());
        System.out.println();

        System.out.println("🍽️ Bon Appétit!\n");
    }
}
