package Command.Abstraction;

public class Demo {
    public static void show() {
        Receiver receiver = new Receiver();

        Command command1 = new Command1(receiver);
        Command command2 = new Command1(receiver);

        Invoker invoker = new Invoker();

        invoker.setCommand(command1);
        invoker.executeCommand();

        invoker.setCommand(command2);
        invoker.executeCommand();
    }
}
