package Memento.Abstraction;

public class Demo {
    public static void show() {
        Originator<String> originator = new Originator<>("");
        Caretaker<Memento<String>> caretaker = new Caretaker<>();

        originator.setState("State 1");
        caretaker.saveState(originator.saveState());

        originator.setState("State 2");
        caretaker.saveState(originator.saveState());

        System.out.println("Current: " + originator.getState());

        originator.restoreState(caretaker.undo());
        System.out.println("After Undo: " + originator.getState()); // it returns the latest state (popped last state from history which is the current one)

        originator.restoreState(caretaker.undo());
        System.out.println("After Undo: " + originator.getState());
    }
}
