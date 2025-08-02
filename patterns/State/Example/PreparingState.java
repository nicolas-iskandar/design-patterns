package State.Example;

public class PreparingState implements KitchenState {
    private KitchenContext context;

    @Override
    public void proceed() {
        System.out.println("Finished preparing. Moving to cooking.");
        context.changeState(new CookingState());
    }

    @Override
    public void describe() {
        System.out.println("Currently preparing ingredients...");
    }

    @Override
    public void setContext(KitchenContext context) {
        this.context = context;
    }
}