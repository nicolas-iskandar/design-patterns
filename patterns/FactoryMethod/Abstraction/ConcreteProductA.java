package FactoryMethod.Abstraction;

public class ConcreteProductA implements Product {
    @Override
    public void doSomething() {
        System.out.println("Product A is doing something");
    }
}
