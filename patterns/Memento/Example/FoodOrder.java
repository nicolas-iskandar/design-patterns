package Memento.Example;

import java.util.ArrayList;
import java.util.List;

public class FoodOrder {
    private List<String> ingredients = new ArrayList<>();

    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }

    public void removeIngredient(String ingredient) {
        ingredients.remove(ingredient);
    }

    public void showOrder() {
        System.out.println("Current ingredients: " + ingredients);
    }

    public FoodOrderMemento saveState() {
        return new FoodOrderMemento(ingredients);
    }

    public void restoreState(FoodOrderMemento memento) {
        this.ingredients = memento.getIngredients();
    }
}
