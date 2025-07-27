package Decorator.Abstraction;

public class BaseDecorator implements Component {
    protected final Component wrapper;

    public BaseDecorator(Component wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void execute() {
        wrapper.execute();
    }
}
