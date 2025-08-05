package Mediator.Abstraction;

public class ConcreteMediator implements Mediator {
    private ComponentA componentA;
    private ComponentB componentB;
    private ComponentC componentC;
    private ComponentD componentD;

    public void setComponentA(ComponentA componentA) {
        this.componentA = componentA;
    }

    public void setComponentB(ComponentB componentB) {
        this.componentB = componentB;
    }

    public void setComponentC(ComponentC componentC) {
        this.componentC = componentC;
    }

    public void setComponentD(ComponentD componentD) {
        this.componentD = componentD;
    }

    @Override
    public void notify(Component sender, String event) {
        System.out.println("Mediator reacts to event '" + event + "' from " + sender.getClass().getSimpleName());

        if (event.equals("A")) {
            System.out.println("Mediator sees event from A. Triggering reactions for B and D.");
            this.reactOnA();
        } else if (event.equals("D")) {
            System.out.println("Mediator sees event from D. Triggering reactions for A and C.");
            this.reactOnD();
        }
    }

    private void reactOnA() {
        System.out.println("  (Executing reactOnA logic...)");
        this.componentB.reactToEvent();
        this.componentD.reactToEvent();
    }

    private void reactOnD() {
        System.out.println("  (Executing reactOnD logic...)");
        this.componentA.reactToEvent();
        this.componentC.reactToEvent();
    }
}
