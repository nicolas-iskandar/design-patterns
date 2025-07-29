package Flyweight.Example;

public class Topping {
    private final String name;
    private final int caloriesPerUnit;
    private final double pricePerUnit;

    public Topping(String name, int caloriesPerUnit, double pricePerUnit) {
        this.name = name;
        this.caloriesPerUnit = caloriesPerUnit;
        this.pricePerUnit = pricePerUnit;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return name + " (" + caloriesPerUnit + " cal/unit, $" + pricePerUnit + "/unit)";
    }
}
