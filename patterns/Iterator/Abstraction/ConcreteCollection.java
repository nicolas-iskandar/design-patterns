package Iterator.Abstraction;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCollection<T> implements IterableCollection<T> {
    private final List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public int size() {
        return items.size();
    }

    public T get(int index) {
        return items.get(index);
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(this);
    }
}
