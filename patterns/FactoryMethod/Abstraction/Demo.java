package FactoryMethod.Abstraction;

import java.util.Scanner;

public class Demo {
    public static void show() {
        System.out.print("Enter Product (A/B): ");
        Scanner scanner = new Scanner(System.in);
        char productType = Character.toUpperCase(scanner.next().charAt(0));

        Creator creator;
        switch (productType) {
            case 'A':
                creator = new ConcreteCreatorA();
                break;
            case 'B':
                creator = new ConcreteCreatorB();
                break;
            default:
                throw new IllegalArgumentException("Invalid Product");
        }

        creator.someOperation();
    }
}
