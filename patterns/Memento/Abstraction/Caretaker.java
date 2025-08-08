package Memento.Abstraction;

import java.util.Stack;

public class Caretaker<T extends Memento> {
    private final Stack<T> history = new Stack<>();

    public void saveState(T memento) {
        history.push(memento);
    }

    public T undo() {
        if (history.isEmpty()) return null;
        return history.pop();
    }
}
