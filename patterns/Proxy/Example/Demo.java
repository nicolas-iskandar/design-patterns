package Proxy.Example;

public class Demo {
    public static void show() {
        User user = new User();
        Recipe recipe = new RecipeProxy(new MasterChefRecipe(), user);

        recipe.getRecipe();
        user.setIsChef(true);
        recipe.getRecipe();
    }
}
