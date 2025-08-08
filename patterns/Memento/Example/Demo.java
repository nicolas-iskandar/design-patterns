package Memento.Example;

public class Demo {
    public static void show() {
        FoodOrder order = new FoodOrder();
        Caretaker<FoodOrderMemento> caretaker = new Caretaker<>();

        order.addIngredient("Bread");
        order.addIngredient("Cheese");
        caretaker.save(order.saveState());
        order.showOrder();

        order.addIngredient("Tomato");
        caretaker.save(order.saveState());
        order.showOrder();

        order.addIngredient("Lettuce");
        caretaker.save(order.saveState());
        order.showOrder();

        order.restoreState(caretaker.undo());
        order.showOrder();

        order.restoreState(caretaker.undo());
        order.showOrder();

        order.restoreState(caretaker.undo());
        order.showOrder();
    }
}
