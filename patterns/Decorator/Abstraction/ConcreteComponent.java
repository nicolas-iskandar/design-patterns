package Decorator.Abstraction;

public class ConcreteComponent implements Component {
    @Override
    public void execute() {
        System.out.println("Concrete Component Executing");
    }
}
