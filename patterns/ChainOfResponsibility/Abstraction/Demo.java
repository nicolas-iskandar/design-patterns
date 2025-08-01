package ChainOfResponsibility.Abstraction;

public class Demo {
    public static void show() {
        ConcreteHandlerA handlerA = new ConcreteHandlerA(false);
        ConcreteHandlerB handlerB = new ConcreteHandlerB(true);

        handlerA.setNext(handlerB);

        handlerA.handle("Process this request");
    }
}
