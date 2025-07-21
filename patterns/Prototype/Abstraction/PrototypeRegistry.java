package Prototype.Abstraction;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private Map<String, Prototype> prototypes = new HashMap<>();

    public void register(String name, Prototype prototype) {
        prototypes.put(name, prototype);
    }

    public Prototype get(String name) {
        if (!prototypes.containsKey(name)) {
            throw new IllegalArgumentException("Prototype not found: " + name);
        }
        return prototypes.get(name).clone();
    }
}
