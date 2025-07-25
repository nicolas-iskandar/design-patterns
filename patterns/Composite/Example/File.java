package Composite.Example;

public class File implements FileSystemItem {
    private final int size;

    public File(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}
