package TemplateMethod.Example;

public abstract class Meal {
    public final void prepareMeal() {
        prepareIngredients();
        cook();
        serve();
        cleanUp();
    }

    protected abstract void prepareIngredients();
    protected abstract void cook();
    protected abstract void serve();

    protected void cleanUp() {
        System.out.println("Cleaning the kitchen.");
    }
}
