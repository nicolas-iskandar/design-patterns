package Strategy.Example;

public class Demo {
    public static void show() {
        FoodContext food = new FoodContext();

        food.setStrategy(new BakeStrategy());
        food.prepareFood();

        food.setStrategy(new FryStrategy());
        food.prepareFood();

        food.setStrategy(new GrillStrategy());
        food.prepareFood();
    }
}
