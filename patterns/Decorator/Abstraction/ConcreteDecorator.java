package Decorator.Abstraction;

public class ConcreteDecorator extends BaseDecorator {
    public ConcreteDecorator(Component wrapper) {
        super(wrapper);
    }

    @Override
    public void execute() {
        super.execute();
        extra();
    }

    private void extra() {
        System.out.println("Doing extra stuff...");
    }
}
