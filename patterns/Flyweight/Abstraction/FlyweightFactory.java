package Flyweight.Abstraction;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static final Map<String, Flyweight> cache = new HashMap<>();

    public static Flyweight getFlyweight(String repeatingState) {
        if (!cache.containsKey(repeatingState)) {
            cache.put(repeatingState, new Flyweight(repeatingState));
        }
        return cache.get(repeatingState);
    }
}
