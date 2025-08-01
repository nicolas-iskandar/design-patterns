package ChainOfResponsibility.Example;

public class PizzaChef extends BaseChef {
    @Override
    public void handle(String food) {
        if (food.equalsIgnoreCase("Pizza")) {
            System.out.println("PizzaChef: I’ll cook the " + food);
        } else {
            super.handle(food);
        }
    }
}
