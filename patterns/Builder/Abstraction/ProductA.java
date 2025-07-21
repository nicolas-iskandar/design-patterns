package Builder.Abstraction;

public class ProductA {
    private int field1;
    private String field2;
    private boolean field3;

    public ProductA(int field1, String field2, boolean field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    @Override
    public String toString() {
        return "ProductA{" + "field1=" + field1 + ", field2='" + field2 + '\'' + ", field3=" + field3 + '}';
    }
}
