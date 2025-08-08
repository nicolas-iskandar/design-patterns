package Visitor.Abstraction;

public class ElementA implements Element {
    public void featureA() {
        System.out.println("ElementA FeatureA");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
