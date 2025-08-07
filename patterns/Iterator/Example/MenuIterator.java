package Iterator.Example;

public class MenuIterator implements Iterator<MenuItem> {
    private final Menu menu;
    private int position = 0;

    public MenuIterator(Menu menu) {
        this.menu = menu;
    }

    @Override
    public boolean hasNext() {
        return position < menu.itemCount();
    }

    @Override
    public MenuItem next() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("No more menu items");
        }

        return menu.getItem(position++);
    }
}
