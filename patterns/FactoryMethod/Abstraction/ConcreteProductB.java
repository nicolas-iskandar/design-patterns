package FactoryMethod.Abstraction;

public class ConcreteProductB implements Product{
    @Override
    public void doSomething() {
        System.out.println("Product B is doing something");
    }
}
