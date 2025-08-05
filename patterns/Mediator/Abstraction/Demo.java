package Mediator.Abstraction;

public class Demo {
    public static void show() {
        ConcreteMediator mediator = new ConcreteMediator();

        ComponentA cA = new ComponentA(mediator);
        ComponentB cB = new ComponentB(mediator);
        ComponentC cC = new ComponentC(mediator);
        ComponentD cD = new ComponentD(mediator);

        mediator.setComponentA(cA);
        mediator.setComponentB(cB);
        mediator.setComponentC(cC);
        mediator.setComponentD(cD);

        System.out.println("--- Client triggers operation A ---");
        cA.operationA();

        System.out.println("\n" + "=".repeat(40) + "\n");

        System.out.println("--- Client triggers operation D ---");
        cD.operationD();
    }
}
