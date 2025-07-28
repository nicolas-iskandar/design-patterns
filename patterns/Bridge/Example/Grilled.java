package Bridge.Example;

public class Grilled implements CookingStyle {
    @Override
    public void cook(String food) {
        System.out.println("Grilling " + food);
    }
}
