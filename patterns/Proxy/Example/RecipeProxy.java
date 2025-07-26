package Proxy.Example;

public class RecipeProxy implements Recipe {
    private final Recipe recipe;

    private User user;

    public RecipeProxy(Recipe recipe, User user) {
        this.recipe = recipe;
        this.user = user;
    }

    @Override
    public void getRecipe() {
        if (user.isChef()) {
            recipe.getRecipe();
        } else {
            System.out.println("Access Denied");
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
