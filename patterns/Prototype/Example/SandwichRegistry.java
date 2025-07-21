package Prototype.Example;

import java.util.HashMap;
import java.util.Map;

public class SandwichRegistry {
    private final Map<String, Sandwich> registry = new HashMap<>();

    public void register(String key, Sandwich sandwich) {
        registry.put(key, sandwich);
    }

    public Sandwich get(String key) {
        Sandwich sandwich = registry.get(key);
        if (sandwich == null) return null;
        return sandwich.clone();
    }
}
