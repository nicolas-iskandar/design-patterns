package Strategy.Example;

public class FryStrategy implements CookingStrategy {
    @Override
    public void cook() {
        System.out.println("Cooking food by frying it in oil.");
    }
}
