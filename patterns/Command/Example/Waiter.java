package Command.Example;

public class Waiter {
    private Command command;

    public void takeOrder(Command command) {
        this.command = command;
    }

    public void placeOrder() {
        if (command != null) command.execute();
    }
}
