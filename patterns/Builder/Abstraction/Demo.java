package Builder.Abstraction;

public class Demo {
    public static void show() {
        Builder<ProductA> builderA = new ConcreteBuilderA();
        ProductA productA = builderA
                .field1(45)
                .field2("Example String A")
                .field3(true)
                .build();
        System.out.println(productA);

        Builder<ProductB> builderB = new ConcreteBuilderB();
        ProductB productB = builderB
                .field1(55)
                .field2("Example String B")
                .field3(false)
                .build();
        System.out.println(productB);


        Director director = new Director();

        ConcreteBuilderA builderDirectorA = new ConcreteBuilderA();
        director.buildProductA(builderDirectorA);
        ProductA directorProductA = builderDirectorA.build();
        System.out.println(directorProductA);

        ConcreteBuilderB builderDirectorB = new ConcreteBuilderB();
        director.buildProductB(builderDirectorB);
        ProductB directorProductB = builderDirectorB.build();
        System.out.println(directorProductB);
    }
}
