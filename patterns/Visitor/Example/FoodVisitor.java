package Visitor.Example;

public interface FoodVisitor {
    void visit(Fruit fruit);
    void visit(Meat meat);
}
