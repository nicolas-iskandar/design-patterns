package Prototype.Abstraction;

public abstract class Prototype {
    private int field1;

    public Prototype(int field1) {
        this.field1 = field1;
    }

    public Prototype(Prototype prototype) {
        this.field1 = prototype.field1;
    }

    public int getField1() {
        return field1;
    }

    public abstract Prototype clone();
}
