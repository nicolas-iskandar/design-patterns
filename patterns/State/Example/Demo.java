package State.Example;

public class Demo {
    public static void show() {
        KitchenContext kitchen = new KitchenContext(new PreparingState());

        kitchen.describe();
        kitchen.proceed();

        kitchen.describe();
        kitchen.proceed();

        kitchen.describe();
        kitchen.proceed();
    }
}
