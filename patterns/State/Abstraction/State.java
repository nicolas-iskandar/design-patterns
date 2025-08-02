package State.Abstraction;

public interface State {
    void doThis();
    void doThat();
    void setContext(Context context);
}
