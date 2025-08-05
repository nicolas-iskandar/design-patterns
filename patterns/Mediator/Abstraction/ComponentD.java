package Mediator.Abstraction;

class ComponentD extends Component {
    public ComponentD(Mediator mediator) {
        super(mediator);
    }

    public void operationD() {
        System.out.println("Component D does something.");
        mediator.notify(this, "D");
    }

    public void reactToEvent() {
        System.out.println("  -> Component D reacts to a general event.");
    }
}
