package TemplateMethod.Example;

public class FriedRiceMeal extends Meal {

    @Override
    protected void prepareIngredients() {
        System.out.println("Chopping vegetables, beating eggs, and preparing cooked rice.");
    }

    @Override
    protected void cook() {
        System.out.println("Stir-frying vegetables and eggs, then adding rice and sauce.");
    }

    @Override
    protected void serve() {
        System.out.println("Serving fried rice with green onions.");
    }
}