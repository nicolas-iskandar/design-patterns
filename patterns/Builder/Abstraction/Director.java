package Builder.Abstraction;

public class Director {
    public void buildProductA(ConcreteBuilderA builder) {
        builder
            .field1(45)
            .field2("Example String A")
            .field3(true)
            .build();
    }

    public void buildProductB(ConcreteBuilderB builder) {
        builder
            .field1(55)
            .field2("Example String B")
            .field3(false)
            .build();
    }
}
