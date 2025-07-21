package Builder.Example;

import java.util.Arrays;

public class Sandwich {
    private final String spread;
    private final String protein;
    private final String cheese;
    private final String[] veggies;
    private final boolean toasted;

    public Sandwich(String spread, String protein, String cheese, String[] veggies, boolean toasted) {
        this.spread = spread;
        this.protein = protein;
        this.cheese = cheese;
        this.veggies = veggies;
        this.toasted = toasted;
    }

    @Override
    public String toString() {
        return "Sandwich{" + "spread='" + spread + '\'' + ", protein='" + protein + '\'' + ", cheese='" + cheese + '\'' + ", veggies=" + Arrays.toString(veggies) + ", toasted=" + toasted + '}';
    }
}
