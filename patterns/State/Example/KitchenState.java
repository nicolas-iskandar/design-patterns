package State.Example;

public interface KitchenState {
    void proceed();
    void describe();
    void setContext(KitchenContext context);
}
