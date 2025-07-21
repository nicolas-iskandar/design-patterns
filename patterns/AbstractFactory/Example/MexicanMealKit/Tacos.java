package AbstractFactory.Example.MexicanMealKit;

import AbstractFactory.Example.MainDish;

public class Tacos implements MainDish {
    @Override
    public String getMainDishName() {
        return "Tacos";
    }

    @Override
    public String describeMainDish() {
        return "Crispy or soft shells bursting with spiced meat, fresh salsa, and fiesta in every bite.";
    }

    @Override
    public void serveMainDish() {
        System.out.println("Taco time! Grab, fold, and get ready for a flavor fiesta!");
    }
}
