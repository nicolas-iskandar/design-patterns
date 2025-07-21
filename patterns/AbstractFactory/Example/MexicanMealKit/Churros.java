package AbstractFactory.Example.MexicanMealKit;

import AbstractFactory.Example.Dessert;

public class Churros implements Dessert {
    @Override
    public String getDessertName() {
        return "Churros";
    }

    @Override
    public String describeDessert() {
        return "Golden sticks of fried dough rolled in cinnamon sugar—basically edible joy.";
    }

    @Override
    public void serveDessert() {
        System.out.println("Sweet sticks of happiness incoming—churros, hot and sugar-dusted!");
    }

    @Override
    public boolean isSweet() {
        return true;
    }
}
