package Iterator.Example;

import java.util.ArrayList;
import java.util.List;

public class Menu implements IterableCollection<MenuItem> {
    private final String restaurantName;
    private final List<MenuItem> items = new ArrayList<>();

    public Menu(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void addItem(String name, double price, String category) {
        items.add(new MenuItem(name, price, category));
    }

    public void removeItem(String name) {
        items.removeIf(item -> item.getName().equals(name));
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new MenuIterator(this);
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public int itemCount() {
        return items.size();
    }

    public MenuItem getItem(int index) {
        return items.get(index);
    }

    public String getRestaurantName() {
        return restaurantName;
    }
}
