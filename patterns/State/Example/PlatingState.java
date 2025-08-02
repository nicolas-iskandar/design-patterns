package State.Example;

public class PlatingState implements KitchenState {
    private KitchenContext context;

    @Override
    public void proceed() {
        System.out.println("Meal is ready! No further steps.");
    }

    @Override
    public void describe() {
        System.out.println("Plating the meal beautifully...");
    }

    @Override
    public void setContext(KitchenContext context) {
        this.context = context;
    }
}
