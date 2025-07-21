package AbstractFactory.Example.MexicanMealKit;

import AbstractFactory.Example.Drink;

public class Horchata implements Drink {
    @Override
    public String getDrinkName() {
        return "Horchata";
    }

    @Override
    public String describeDrink() {
        return "A chilled, creamy cinnamon-rice drink that tastes like dessert and refreshment had a baby.";
    }

    @Override
    public void serveDrink() {
        System.out.println("Pouring you a glass of cool horchata—smooth, sweet, and cinnamon-kissed!");
    }

    @Override
    public boolean isAlcoholic() {
        return false;
    }
}
