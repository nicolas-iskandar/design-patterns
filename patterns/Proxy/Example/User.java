package Proxy.Example;

public class User {
    private boolean isChef;

    public User() {
        this(false);
    }

    public User(boolean isChef) {
        this.isChef = isChef;
    }

    public boolean isChef() {
        return isChef;
    }

    public void setIsChef(boolean isChef) {
        this.isChef = isChef;
    }
}
