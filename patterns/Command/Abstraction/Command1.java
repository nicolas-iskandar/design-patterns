package Command.Abstraction;

public class Command1 implements Command {
    private final Receiver receiver;

    public Command1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action1();
    }
}
