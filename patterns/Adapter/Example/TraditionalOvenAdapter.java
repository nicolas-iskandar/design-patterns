package Adapter.Example;

public class TraditionalOvenAdapter implements Oven {
    private final TraditionalOven traditionalOven;

    public TraditionalOvenAdapter(TraditionalOven traditionalOven) {
        this.traditionalOven = traditionalOven;
    }

    @Override
    public void setTemperature(double temperatureCelsius) {
        double temperatureFahrenheit = temperatureCelsius * 9 / 5 + 32;
        traditionalOven.heatUp(temperatureFahrenheit);
    }

    @Override
    public void startTimer(int minutes) {
        int seconds = minutes * 60;
        traditionalOven.setCookTime(seconds);
    }

    @Override
    public void turnOn() {
        traditionalOven.powerSwitch(true);
    }

    @Override
    public void turnOff() {
        traditionalOven.powerSwitch(false);
    }
}
