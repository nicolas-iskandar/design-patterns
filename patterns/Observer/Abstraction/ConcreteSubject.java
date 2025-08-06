package Observer.Abstraction;

public class ConcreteSubject extends Subject {
    private String state;

    public void setState(String newState) {
        this.state = newState;
        notifyObservers("State changed to: " + newState);
    }

    public String getState() {
        return state;
    }
}
