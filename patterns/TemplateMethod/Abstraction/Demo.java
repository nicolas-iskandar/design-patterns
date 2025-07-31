package TemplateMethod.Abstraction;

public class Demo {
    public static void show() {
        AbstractClass abstractClass = new ConcreteClass1();
        abstractClass.templateMethod();
        abstractClass = new ConcreteClass2();
        abstractClass.templateMethod();
    }
}
