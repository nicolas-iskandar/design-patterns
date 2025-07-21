package AbstractFactory.Example.JapaneseMealKit;

import AbstractFactory.Example.Drink;

public class GreenTea implements Drink {
    @Override
    public String getDrinkName() {
        return "Drink Tea";
    }

    @Override
    public String describeDrink() {
        return "Earthy, soothing, and subtly bitter—like zen in a cup.";
    }

    @Override
    public void serveDrink() {
        System.out.println("Here’s your green tea—steeped in calm, poured with care.");
    }

    @Override
    public boolean isAlcoholic() {
        return false;
    }
}
