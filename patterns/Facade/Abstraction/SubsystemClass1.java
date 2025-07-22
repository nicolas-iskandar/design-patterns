package Facade.Abstraction;

public class SubsystemClass1 implements SubsystemClass {
    @Override
    public void complexOperation() {
        System.out.println("Subsystem 1: Doing a complex operation");
    }

    @Override
    public void anotherComplexOperation() {
        System.out.println("Subsystem 1: Doing another complex operation");
    }

    @Override
    public void yetAnotherComplexOperation() {
        System.out.println("Subsystem 1: Doing yet another complex operation");
    }
}
