package Mediator.Example;

public class ConcreteFoodOrderMediator implements FoodOrderMediator {
    private final Customer customer;
    private final Restaurant restaurant;

    public ConcreteFoodOrderMediator(Customer customer, Restaurant restaurant) {
        this.customer = customer;
        this.restaurant = restaurant;
    }

    @Override
    public void orderFood(String foodItem) {
        restaurant.cook(foodItem);
        System.out.println("Mediator: Notifying customer that " + foodItem + " is ready");
        customer.receiveFood(foodItem);
    }
}
