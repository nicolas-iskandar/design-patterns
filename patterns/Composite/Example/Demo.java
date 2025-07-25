package Composite.Example;

public class Demo {
    public static void show() {
        File file1 = new File(10);
        File file2 = new File(20);
        File file3 = new File(30);

        Folder folder1 = new Folder();
        folder1.addItem(file1);
        folder1.addItem(file2);

        Folder folder2 = new Folder();
        folder2.addItem(file3);

        Folder root = new Folder();
        root.addItem(folder1);
        root.addItem(folder2);

        System.out.println("Total size of root folder: " + root.getSize());
    }
}
