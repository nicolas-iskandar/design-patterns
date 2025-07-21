package FactoryMethod.Example;

public class Demo {
    public static void show() {
        Bakery paris = new ParisBakery();
        Bakery ny = new NewYorkBakery();
        Bakery tokyo = new TokyoBakery();

        paris.serverPastry();
        ny.serverPastry();
        tokyo.serverPastry();
    }
}
