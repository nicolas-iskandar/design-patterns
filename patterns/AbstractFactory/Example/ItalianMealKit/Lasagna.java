package AbstractFactory.Example.ItalianMealKit;

import AbstractFactory.Example.MainDish;

public class Lasagna implements MainDish {
    @Override
    public String getMainDishName() {
        return "Lasagna";
    }

    @Override
    public String describeMainDish() {
        return "Layers of pasta, rich meat sauce, and molten cheese—each bite is like a warm Italian hug.";
    }

    @Override
    public void serveMainDish() {
        System.out.println("Your lasagna has landed—hot, hearty, and holding nothing back!");
    }
}
