package ChainOfResponsibility.Example;

public interface FoodHandler {
    void setNext(FoodHandler next);
    void handle(String food);
}
