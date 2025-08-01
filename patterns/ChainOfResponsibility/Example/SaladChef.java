package ChainOfResponsibility.Example;

public class SaladChef extends BaseChef {
    @Override
    public void handle(String food) {
        if (food.equalsIgnoreCase("Salad")) {
            System.out.println("SaladChef: I’ll prepare the " + food);
        } else {
            super.handle(food);
        }
    }
}