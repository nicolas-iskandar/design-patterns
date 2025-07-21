package AbstractFactory.Example.JapaneseMealKit;

import AbstractFactory.Example.MainDish;

public class Sushi implements MainDish {
    @Override
    public String getMainDishName() {
        return "Sushi";
    }

    @Override
    public String describeMainDish() {
        return "Perfectly rolled vinegared rice wrapped around fresh fish and veggies—minimalist art you can eat.";
    }

    @Override
    public void serveMainDish() {
        System.out.println("Precision on a plate—your sushi is served, fresh as a sea breeze!");
    }
}
