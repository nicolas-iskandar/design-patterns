package Visitor.Example;

public class Demo {
    public static void show() {
        FoodItem[] items = {
                new Fruit("Apple", 95),
                new Fruit("Banana", 105),
                new Meat("Chicken Breast", 7.5),
                new Meat("Beef Steak", 12.0)
        };

        final int[] totalCalories = {0};
        final double[] totalPrice = {0.0};

        FoodVisitor calorieCounter = new FoodVisitor() {
            @Override
            public void visit(Fruit fruit) {
                totalCalories[0] += fruit.getCalories();
                System.out.println(fruit.getName() + " calories counted: " + fruit.getCalories());
            }

            @Override
            public void visit(Meat meat) {
                System.out.println("Skipping calorie count for meat: " + meat.getName());
            }
        };

        FoodVisitor priceCalculator = new FoodVisitor() {
            @Override
            public void visit(Fruit fruit) {
                System.out.println("Skipping price for fruit: " + fruit.getName());
            }

            @Override
            public void visit(Meat meat) {
                totalPrice[0] += meat.getPrice();
                System.out.println(meat.getName() + " price added: $" + meat.getPrice());
            }
        };

        for (FoodItem item : items) {
            item.accept(calorieCounter);
            item.accept(priceCalculator);
        }

        System.out.println("Total Calories (fruits): " + totalCalories[0]);
        System.out.println("Total Price (meat): $" + totalPrice[0]);
    }
}
