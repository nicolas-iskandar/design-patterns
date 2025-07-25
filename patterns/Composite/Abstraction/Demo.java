package Composite.Abstraction;

public class Demo {
    public static void show() {
        Composite root = new Composite();
        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();

        Composite subComposite = new Composite();
        subComposite.add(new Leaf());

        root.add(leaf1);
        root.add(subComposite);
        root.add(leaf2);

        root.execute();
    }
}
