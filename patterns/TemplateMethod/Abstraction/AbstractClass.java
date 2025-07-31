package TemplateMethod.Abstraction;

public abstract class AbstractClass {
    public final void templateMethod() {
        step1();
        step2();
        step3();
    }

    public void step1() {
        System.out.println("Common Step 1");
    }

    public abstract void step2();
    public abstract void step3();
}
