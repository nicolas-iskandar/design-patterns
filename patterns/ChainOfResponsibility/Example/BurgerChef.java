package ChainOfResponsibility.Example;

public class BurgerChef extends BaseChef {
    @Override
    public void handle(String food) {
        if (food.equalsIgnoreCase("Burger")) {
            System.out.println("BurgerChef: I'll handle the " + food);
        } else {
            super.handle(food);
        }
    }
}
