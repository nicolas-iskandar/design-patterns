package Mediator.Abstraction;

public class ComponentA extends Component {
    public ComponentA(Mediator mediator) {
        super(mediator);
    }

    public void operationA() {
        System.out.println("Component A does something.");
        mediator.notify(this, "A");
    }

    public void reactToEvent() {
        System.out.println("  -> Component A reacts to a general event.");
    }
}
