package Adapter.Example;

public class Demo {
    public static void show() {
        Oven oven = new TraditionalOvenAdapter(new TraditionalOven());

        System.out.println("Let's bake a pizza!");
        oven.turnOn();
        oven.setTemperature(220);
        oven.startTimer(15);
        System.out.println("Pizza is baking...");
        oven.turnOff();
    }
}
