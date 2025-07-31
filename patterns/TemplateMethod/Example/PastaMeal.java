package TemplateMethod.Example;

public class PastaMeal extends Meal {
    @Override
    protected void prepareIngredients() {
        System.out.println("Boiling water, getting pasta, preparing sauce and garlic.");
    }

    @Override
    protected void cook() {
        System.out.println("Boiling pasta and cooking the sauce.");
    }

    @Override
    protected void serve() {
        System.out.println("Plating pasta and adding parmesan cheese.");
    }
}
