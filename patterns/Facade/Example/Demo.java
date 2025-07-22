package Facade.Example;

public class Demo {
    public static void show() {
        PizzaFacade pizzaFacade = new PizzaFacade();
        pizzaFacade.orderMargherita();
    }
}
