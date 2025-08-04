package Command.Example;

public class MakePastaCommand implements Command {
    private final Chef chef;

    public MakePastaCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.makePasta();
    }
}
