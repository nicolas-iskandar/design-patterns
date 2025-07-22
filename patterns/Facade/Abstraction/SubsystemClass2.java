package Facade.Abstraction;

public class SubsystemClass2 implements SubsystemClass {
    @Override
    public void complexOperation() {
        System.out.println("Subsystem 2: Doing a complex operation");
    }

    @Override
    public void anotherComplexOperation() {
        System.out.println("Subsystem 2: Doing another complex operation");
    }

    @Override
    public void yetAnotherComplexOperation() {
        System.out.println("Subsystem 2: Doing yet another complex operation");
    }
}
