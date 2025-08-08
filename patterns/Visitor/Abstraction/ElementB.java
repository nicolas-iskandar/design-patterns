package Visitor.Abstraction;

public class ElementB implements Element {
    public void featureB() {
        System.out.println("ElementB FeatureB");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
