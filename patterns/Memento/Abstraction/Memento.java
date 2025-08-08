package Memento.Abstraction;

public class Memento<T> {
    private final T state;

    public Memento(T state) {
        this.state = state;
    }

    public T getState() {
        return state;
    }
}
