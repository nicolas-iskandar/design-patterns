package Adapter.Example;

public class TraditionalOven {
    public void heatUp(double temperatureFahrenheit) {
        System.out.println("Traditional oven heating up to " + temperatureFahrenheit + " degrees Fahrenheit.");
    }

    public void setCookTime(int seconds) {
        System.out.println("Traditional oven cooking for " + seconds + " seconds.");
    }

    public void powerSwitch(boolean on) {
        System.out.println("Traditional oven " + (on ? "on" : "off"));
    }
}
