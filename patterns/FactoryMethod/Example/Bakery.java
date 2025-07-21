package FactoryMethod.Example;

public abstract class Bakery {
    public abstract Pastry createBakery();

    public void serverPastry() {
        Pastry pastry = createBakery();
        System.out.println("Serving " + pastry.getName() + " from " + this.getClass().getSimpleName());
    }
}
