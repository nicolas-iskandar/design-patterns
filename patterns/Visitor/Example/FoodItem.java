package Visitor.Example;

public interface FoodItem {
    void accept(FoodVisitor visitor);
}
