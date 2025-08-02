package State.Example;

public class CookingState implements KitchenState {
    private KitchenContext context;

    @Override
    public void proceed() {
        System.out.println("Cooking done. Moving to plating.");
        context.changeState(new PlatingState());
    }

    @Override
    public void describe() {
        System.out.println("Currently cooking the food...");
    }

    @Override
    public void setContext(KitchenContext context) {
        this.context = context;
    }
}
