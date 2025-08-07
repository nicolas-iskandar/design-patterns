package Iterator.Example;

public class Demo {
    public static void show() {
        Menu dinnerMenu = new Menu("Gourmet Paradise");

        dinnerMenu.addItem("Bruschetta", 8.99, "Appetizer");
        dinnerMenu.addItem("Caesar Salad", 10.50, "Appetizer");
        dinnerMenu.addItem("Grilled Salmon", 24.99, "Main Course");
        dinnerMenu.addItem("Vegetable Risotto", 18.75, "Main Course");
        dinnerMenu.addItem("Chocolate Cake", 9.25, "Dessert");
        dinnerMenu.addItem("Tiramisu", 8.50, "Dessert");
        dinnerMenu.addItem("Sparkling Water", 3.00, "Beverage");

        System.out.println("=== Full Menu at " + dinnerMenu.getRestaurantName() + " ===");
        Iterator<MenuItem> fullMenuIterator = dinnerMenu.createIterator();
        while (fullMenuIterator.hasNext()) {
            System.out.println(fullMenuIterator.next());
        }
    }
}
