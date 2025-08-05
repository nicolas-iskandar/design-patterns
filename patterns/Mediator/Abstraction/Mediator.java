package Mediator.Abstraction;

public interface Mediator {
    void notify(Component sender, String event);
}
