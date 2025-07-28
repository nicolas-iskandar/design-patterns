package Bridge.Example;

public class Noodles extends Food {
    public Noodles(CookingStyle cookingStyle) {
        super(cookingStyle);
    }

    @Override
    public void prepare() {
        cookingStyle.cook("Noodles");
    }
}
