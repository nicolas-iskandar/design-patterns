package Prototype.Example;

public class Demo {
    public static void show() {
        SandwichRegistry registry = new SandwichRegistry();
        registry.register("blt", new BLTSandwich());
        registry.register("turkey", new TurkeyClubSandwich());

        Sandwich lunch = registry.get("blt");
        lunch.describe();

        BaseSandwich sandwich = (BaseSandwich) registry.get("turkey");
        sandwich.setName("New Sandwich");
        sandwich.setBreadType("White");
        sandwich.getFillings().add("Avocado");
        sandwich.describe();
    }
}
