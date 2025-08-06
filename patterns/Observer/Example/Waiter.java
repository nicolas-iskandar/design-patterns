package Observer.Example;

public class Waiter implements OrderObserver {
    private final String name;

    public Waiter(String name) {
        this.name = name;
    }

    @Override
    public void update(String order) {
        System.out.println(name + ": Received notification - '" + order + "' is ready!");
    }
}
