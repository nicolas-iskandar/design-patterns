package FactoryMethod.Example;

public class NewYorkBakery extends Bakery {
    @Override
    public Pastry createBakery() {
        return new Bagel();
    }
}
