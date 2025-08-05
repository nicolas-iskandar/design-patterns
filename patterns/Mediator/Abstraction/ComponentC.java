package Mediator.Abstraction;

class ComponentC extends Component {
    public ComponentC(Mediator mediator) {
        super(mediator);
    }

    public void operationC() {
        System.out.println("Component C does something.");
        mediator.notify(this, "C");
    }

    public void reactToEvent() {
        System.out.println("  -> Component C reacts to a general event.");
    }
}
