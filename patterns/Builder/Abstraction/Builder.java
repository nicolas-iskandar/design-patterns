package Builder.Abstraction;

public interface Builder<T> {
    Builder<T> field1(int field1);
    Builder<T> field2(String field2);
    Builder<T> field3(boolean field3);
    T build();
}
