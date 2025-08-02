package State.Abstraction;

public class ConcreteState2 implements State {
    private Context context;

    @Override
    public void doThis() {
        System.out.println("ConcreteState2 Doing This");
        context.changeState(new ConcreteState1());
    }

    @Override
    public void doThat() {
        System.out.println("ConcreteState2 Doing That");
        context.changeState(new ConcreteState1());
    }

    @Override
    public void setContext(Context context) {
        this.context = context;
    }
}
