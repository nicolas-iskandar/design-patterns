package Strategy.Example;

public class BakeStrategy implements CookingStrategy {
    @Override
    public void cook() {
        System.out.println("Cooking food by baking it in the oven.");
    }
}