package AbstractFactory.Example.JapaneseMealKit;

import AbstractFactory.Example.Dessert;

public class Mochi implements Dessert {
    @Override
    public String getDessertName() {
        return "Mochi";
    }

    @Override
    public String describeDessert() {
        return "Chewy rice cake with a surprise sweet center—soft, squishy, and totally addictive.";
    }

    @Override
    public void serveDessert() {
        System.out.println("Incoming mochi: soft, chewy, and ready to sweeten your day!");
    }

    @Override
    public boolean isSweet() {
        return false;
    }
}
