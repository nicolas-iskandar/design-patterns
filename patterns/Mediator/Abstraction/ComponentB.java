package Mediator.Abstraction;

class ComponentB extends Component {
    public ComponentB(Mediator mediator) {
        super(mediator);
    }

    public void operationB() {
        System.out.println("Component B does something.");
        mediator.notify(this, "B");
    }

    public void reactToEvent() {
        System.out.println("  -> Component B reacts to a general event.");
    }
}
