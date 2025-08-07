package Iterator.Example;

public interface IterableCollection<T> {
    Iterator<T> createIterator();
}
