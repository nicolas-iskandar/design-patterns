package Iterator.Abstraction;

public class ConcreteIterator<T> implements Iterator<T> {
    private final ConcreteCollection<T> collection;
    private int index = 0;

    public ConcreteIterator(ConcreteCollection<T> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return index < collection.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("No more elements");
        }

        return collection.get(index++);
    }
}
