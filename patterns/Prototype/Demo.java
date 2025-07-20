package Prototype;

public class Demo {
    public static void show() {
        ConcretePrototype original = new ConcretePrototype(10, 20);
        ConcretePrototype clone = (ConcretePrototype) original.clone();

        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);


        PrototypeRegistry registry = new PrototypeRegistry();

        registry.register("basic", new ConcretePrototype(1, 2));
        registry.register("advanced", new ConcretePrototype(10, 20));

        ConcretePrototype copy = (ConcretePrototype) registry.get("advanced");

        System.out.println(copy.getField1());
        System.out.println(copy.getField2());
    }
}
