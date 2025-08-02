package State.Abstraction;

public class ConcreteState1 implements State {
    private Context context;

    @Override
    public void doThis() {
        System.out.println("ConcreteState1 Doing This");
        context.changeState(new ConcreteState2());
    }

    @Override
    public void doThat() {
        System.out.println("ConcreteState1 Doing That");
        context.changeState(new ConcreteState2());
    }

    @Override
    public void setContext(Context context) {
        this.context = context;
    }
}
