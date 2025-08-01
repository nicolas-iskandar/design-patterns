package ChainOfResponsibility.Example;

public class Demo {
    public static void show() {
        FoodHandler burgerChef = new BurgerChef();
        FoodHandler saladChef = new SaladChef();
        FoodHandler pizzaChef = new PizzaChef();

        burgerChef.setNext(saladChef);
        saladChef.setNext(pizzaChef);

        burgerChef.handle("Pizza");
        burgerChef.handle("Salad");
        burgerChef.handle("Burger");
        burgerChef.handle("Sushi");
    }
}
