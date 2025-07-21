package Prototype.Example;

import java.util.ArrayList;
import java.util.List;

public class BaseSandwich implements Sandwich {
    private String name;
    private String breadType;
    private List<String> fillings = new ArrayList<>();
    private List<String> condiments = new ArrayList<>();
    private boolean toasted;

    @Override
    public Sandwich clone() {
        BaseSandwich copy = new BaseSandwich();
        copy.name = name;
        copy.breadType = breadType;
        copy.fillings = new ArrayList<>(this.fillings);
        copy.condiments = new ArrayList<>(this.condiments);
        copy.toasted = this.toasted;
        return copy;
    }

    @Override
    public void describe() {
        System.out.println(name);
        System.out.println("Bread: " + breadType);
        System.out.println("Toasted: " + (toasted ? "Yes" : "No"));
        System.out.println("Fillings: " + String.join(", ", fillings));
        System.out.println("Condiments: " + String.join(", ", condiments));
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public List<String> getFillings() {
        return fillings;
    }

    public void setFillings(List<String> fillings) {
        this.fillings = fillings;
    }

    public List<String> getCondiments() {
        return condiments;
    }

    public void setCondiments(List<String> condiments) {
        this.condiments = condiments;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }
}
