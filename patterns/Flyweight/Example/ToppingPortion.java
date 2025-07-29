package Flyweight.Example;

public class ToppingPortion {
    private final Topping topping;
    private final int quantity;
    private final String placement;
    private final String notes;

    public ToppingPortion(Topping topping, int quantity, String placement, String notes) {
        this.topping = topping;
        this.quantity = quantity;
        this.placement = placement;
        this.notes = notes;
    }

    public String describe() {
        return quantity + "x " + topping.getName() + " on " + placement + (notes.isEmpty() ? "" : " - " + notes);
    }
}
