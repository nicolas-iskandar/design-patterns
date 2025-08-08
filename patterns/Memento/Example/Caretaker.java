package Memento.Example;

import java.util.Stack;

public class Caretaker<T extends FoodOrderMemento> {
    private final Stack<T> history = new Stack<>();

    public void save(T memento) {
        history.push(memento);
    }

    public T undo() {
        if (history.isEmpty()) return null;
        return history.pop();
    }
}
