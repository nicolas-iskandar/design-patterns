package Decorator.Abstraction;

public class Demo {
    public static void show() {
//        Component component = new ConcreteDecorator(
//                new ConcreteDecorator(
//                        new ConcreteComponent()
//                )
//        );

        Component component = new ConcreteComponent();
        component = new ConcreteDecorator(component);
        component = new ConcreteDecorator(component);

        component.execute();
    }
}
