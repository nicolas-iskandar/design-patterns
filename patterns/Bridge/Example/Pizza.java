package Bridge.Example;

public class Pizza extends Food {
    public Pizza(CookingStyle cookingStyle) {
        super(cookingStyle);
    }

    @Override
    public void prepare() {
        cookingStyle.cook("Pizza");
    }
}
