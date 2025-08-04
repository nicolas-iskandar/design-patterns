package Command.Example;

public class MakePizzaCommand implements Command {
    private final Chef chef;

    public MakePizzaCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.makePizza();
    }
}
