package Builder;

public class ConcreteBuilderA implements Builder<ProductA> {
    private int field1;
    private String field2;
    private boolean field3;

    @Override
    public Builder<ProductA> field1(int field1) {
        this.field1 = field1;
        return this;
    }

    @Override
    public Builder<ProductA> field2(String field2) {
        this.field2 = field2;
        return this;
    }

    @Override
    public Builder<ProductA> field3(boolean field3) {
        this.field3 = field3;
        return this;
    }

    @Override
    public ProductA build() {
        return new ProductA(field1, field2, field3);
    }
}
