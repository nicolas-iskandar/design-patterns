package Composite.Abstraction;

public class Leaf implements Component {
    @Override
    public void execute() {
        System.out.println("Leaf executing");
    }
}
