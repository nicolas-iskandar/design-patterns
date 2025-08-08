package Strategy.Example;

public class GrillStrategy implements CookingStrategy {
    @Override
    public void cook() {
        System.out.println("Cooking food by grilling it over fire.");
    }
}
