package Bridge.Example;

public abstract class Food {
    protected CookingStyle cookingStyle;

    public Food(CookingStyle cookingStyle) {
        this.cookingStyle = cookingStyle;
    }

    public abstract void prepare();
}
