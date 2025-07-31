package TemplateMethod.Example;

public class Demo {
    public static void show() {
        Meal meal = new PastaMeal();
        System.out.println("=== Making Pasta ===");
        meal.prepareMeal();

        System.out.println();

        meal = new FriedRiceMeal();
        System.out.println("=== Making Fried Rice ===");
        meal.prepareMeal();
    }
}
