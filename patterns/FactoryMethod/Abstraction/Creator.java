package FactoryMethod.Abstraction;

public abstract class Creator {
    public abstract Product createProduct(); // factory method

    public void someOperation() {
        Product product = createProduct();
        product.doSomething();
    }
}
