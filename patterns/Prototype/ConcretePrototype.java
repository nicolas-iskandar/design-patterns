package Prototype;

public class ConcretePrototype extends Prototype {
    private int field2;

    public ConcretePrototype(int field1, int field2) {
        super(field1);
        this.field2 = field2;
    }

    public ConcretePrototype(ConcretePrototype original) {
        super(original);
        this.field2 = original.field2;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this);
    }

    public int getField2() {
        return field2;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" + "field1=" + getField1() + ", field2=" + field2 + '}';
    }
}
