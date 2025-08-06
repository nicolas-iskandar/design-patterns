package Observer.Example;

import java.util.ArrayList;
import java.util.List;

public abstract class Kitchen {
    private final List<OrderObserver> observers = new ArrayList<>();

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    protected void notifyObservers(String order) {
        for (OrderObserver observer : observers) {
            observer.update(order);
        }
    }
}
