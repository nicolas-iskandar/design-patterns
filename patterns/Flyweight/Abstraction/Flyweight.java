package Flyweight.Abstraction;

public class Flyweight {
    private final String repeatingState;

    public Flyweight(String repeatingState) {
        this.repeatingState = repeatingState;
    }

    public void operation(String uniqueState) {
        System.out.println("Flyweight: Repeating State = " + repeatingState + ", Unique State = " + uniqueState);
    }
}
