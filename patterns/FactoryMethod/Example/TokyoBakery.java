package FactoryMethod.Example;

public class TokyoBakery extends Bakery {
    @Override
    public Pastry createBakery() {
        return new Melonpan();
    }
}
