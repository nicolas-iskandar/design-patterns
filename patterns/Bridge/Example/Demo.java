package Bridge.Example;

public class Demo {
    public static void show() {
        Food grilledPizza = new Pizza(new Grilled());
        grilledPizza.prepare();

        Food friedNoodles = new Noodles(new Fried());
        friedNoodles.prepare();
    }
}
