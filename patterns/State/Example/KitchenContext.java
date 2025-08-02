package State.Example;

public class KitchenContext {
    private KitchenState currentState;

    public KitchenContext(KitchenState initialState) {
        this.currentState = initialState;
        this.currentState.setContext(this);
    }

    public void changeState(KitchenState newState) {
        this.currentState = newState;
        this.currentState.setContext(this);
    }

    public void proceed() {
        currentState.proceed();
    }

    public void describe() {
        currentState.describe();
    }
}
