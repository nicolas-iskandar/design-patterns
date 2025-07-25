package Composite.Example;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem {
    private final List<FileSystemItem> items;

    public Folder() {
        this.items = new ArrayList<>();
    }

    public void addItem(FileSystemItem item) {
        items.add(item);
    }

    public void removeItem(FileSystemItem item) {
        items.remove(item);
    }

    public List<FileSystemItem> getItems() {
        return items;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (FileSystemItem item : items) {
            size += item.getSize();
        }
        return size;
    }
}
