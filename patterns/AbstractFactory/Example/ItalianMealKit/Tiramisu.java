package AbstractFactory.Example.ItalianMealKit;

import AbstractFactory.Example.Dessert;

public class Tiramisu implements Dessert {

    @Override
    public String getDessertName() {
        return "Tiramisu";
    }

    @Override
    public String describeDessert() {
        return "Fluffy clouds of mascarpone cream over espresso-soaked ladyfingers—bittersweet bliss in every spoonful.";
    }

    @Override
    public void serveDessert() {
        System.out.println("And now, the grand finale: tiramisu, floating in like a caffeinated cloud!");
    }

    @Override
    public boolean isSweet() {
        return true;
    }
}
