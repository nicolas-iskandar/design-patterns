package Builder.Example;

public class Demo {
    public static void show() {
        Sandwich sandwich = new SandwichBuilder()
                .spread("Pesto")
                .protein("Chicken")
                .cheese("Provolone")
                .veggies("Lettuce, Tomato, Olives")
                .toasted(true)
                .build();
        System.out.println(sandwich);
    }
}
