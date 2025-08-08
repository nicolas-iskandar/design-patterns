package Memento.Abstraction;

public class Originator<T> {
    private T state;

    public Originator(T state) {
        this.state = state;
    }

    public void setState(T state) {
        this.state = state;
    }

    public T getState() {
        return state;
    }

    public Memento<T> saveState() {
        return new Memento<>(state);
    }

    public void restoreState(Memento<T> memento) {
        this.state = memento.getState();
    }
}
