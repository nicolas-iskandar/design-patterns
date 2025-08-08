package Visitor.Example;

public class Meat implements FoodItem {
    private final String name;
    private final double price;

    public Meat(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(FoodVisitor visitor) {
        visitor.visit(this);
    }
}
