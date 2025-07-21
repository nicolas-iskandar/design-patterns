package AbstractFactory.Abstraction;

public class Demo {
    public static void show() {
        AbstractFactory factory1 = new ConcreteAbstractFactory1();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();
        productA1.doSomething();
        productB1.doSomething();

        AbstractFactory factory2 = new ConcreteAbstractFactory2();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();
        productA2.doSomething();
        productB2.doSomething();
    }
}
