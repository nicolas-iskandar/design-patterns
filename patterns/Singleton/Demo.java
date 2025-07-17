package Singleton;

public class Demo {
    public static void show() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println("Same instance? " + instance1.equals(instance2));
        System.out.println("Address 1: " + instance1);
        System.out.println("Address 2: " + instance2);

    }
}
