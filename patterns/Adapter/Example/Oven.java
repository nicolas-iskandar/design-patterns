package Adapter.Example;

public interface Oven {
    void setTemperature(double temperatureCelsius);
    void startTimer(int minutes);
    void turnOn();
    void turnOff();
}
