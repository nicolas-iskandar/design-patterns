package Observer.Abstraction;

public class Demo {
    public static void show() {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        subject.attach(observer1);
        subject.attach(observer2);

        subject.setState("ACTIVE");
        subject.setState("INACTIVE");
    }
}
