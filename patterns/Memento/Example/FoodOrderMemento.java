package Memento.Example;

import java.util.ArrayList;
import java.util.List;

public class FoodOrderMemento {
    private final List<String> ingredients;

    public FoodOrderMemento(List<String> ingredients) {
        this.ingredients = new ArrayList<>(ingredients);
    }

    public List<String> getIngredients() {
        return new ArrayList<>(ingredients);
    }
}
