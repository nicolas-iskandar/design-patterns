package State.Abstraction;

public class Context {
    private State state;

    public Context(State initialState) {
        this.state = initialState;
        this.state.setContext(this);
    }

    public void changeState(State state) {
        this.state = state;
        this.state.setContext(this);
    }

    public void doThis() {
        state.doThis();
    }

    public void doThat() {
        state.doThat();
    }
}
