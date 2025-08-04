package Command.Abstraction;

public class Command2 implements Command {
    private final Receiver receiver;

    public Command2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action2();
    }
}
