package Bridge.Example;

public class Fried implements CookingStyle {
    @Override
    public void cook(String food) {
        System.out.println("Frying " + food);
    }
}
