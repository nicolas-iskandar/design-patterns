package ChainOfResponsibility.Example;

public class BaseChef implements FoodHandler {
    private FoodHandler next;

    @Override
    public void setNext(FoodHandler next) {
        this.next = next;
    }

    @Override
    public void handle(String food) {
        if (next != null) {
            next.handle(food);
        } else {
            System.out.println("No chef could prepare: " + food);
        }
    }
}
