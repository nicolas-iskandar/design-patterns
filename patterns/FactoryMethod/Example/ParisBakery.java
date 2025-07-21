package FactoryMethod.Example;

public class ParisBakery extends Bakery {
    @Override
    public Pastry createBakery() {
        return new Croissant();
    }
}
