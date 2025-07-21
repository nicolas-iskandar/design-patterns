package Builder.Example;

public class SandwichBuilder {
    private String spread;
    private String protein;
    private String cheese;
    private String[] veggies;
    private boolean toasted;

    public SandwichBuilder spread(String spread) {
        this.spread = spread;
        return this;
    }

    public SandwichBuilder protein(String protein) {
        this.protein = protein;
        return this;
    }

    public SandwichBuilder cheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public SandwichBuilder veggies(String ...veggies) {
        this.veggies = veggies;
        return this;
    }

    public SandwichBuilder toasted(boolean toasted) {
        this.toasted = toasted;
        return this;
    }

    public Sandwich build() {
        return new Sandwich(spread, protein, cheese, veggies, toasted);
    }
}
