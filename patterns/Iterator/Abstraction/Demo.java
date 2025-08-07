package Iterator.Abstraction;

public class Demo {
    public static void show() {
        ConcreteCollection<String> collection = new ConcreteCollection<>();
        collection.addItem("First");
        collection.addItem("Second");
        collection.addItem("Third");

        Iterator<String> iterator = collection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ConcreteCollection<Integer> numberCollection = new ConcreteCollection<>();
        numberCollection.addItem(10);
        numberCollection.addItem(20);
        numberCollection.addItem(30);

        Iterator<Integer> numberIterator = numberCollection.createIterator();
        while (numberIterator.hasNext()) {
            System.out.println("Number: " + numberIterator.next());
        }
    }
}
