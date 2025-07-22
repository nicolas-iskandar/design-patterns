package Facade.Abstraction;

public class Facade {
    SubsystemClass subsystemClass;

    public Facade(SubsystemClass subsystemClass) {
        this.subsystemClass = subsystemClass;
    }

    public void operation() {
        subsystemClass.complexOperation();
        subsystemClass.anotherComplexOperation();
        subsystemClass.yetAnotherComplexOperation();
    }
}
