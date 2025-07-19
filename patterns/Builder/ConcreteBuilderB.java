package Builder;

public class ConcreteBuilderB implements Builder<ProductB> {
    private int field1;
    private String field2;
    private boolean field3;

    @Override
    public Builder<ProductB> field1(int field1) {
        this.field1 = field1;
        return this;
    }

    @Override
    public Builder<ProductB> field2(String field2) {
        this.field2 = field2;
        return this;
    }

    @Override
    public Builder<ProductB> field3(boolean field3) {
        this.field3 = field3;
        return this;
    }

    @Override
    public ProductB build() {
        return new ProductB(field1, field2, field3);
    }
}
