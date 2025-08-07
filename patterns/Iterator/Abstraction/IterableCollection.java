package Iterator.Abstraction;

public interface IterableCollection<T> {
    Iterator<T> createIterator();
}
