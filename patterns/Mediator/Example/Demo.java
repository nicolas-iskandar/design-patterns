package Mediator.Example;

public class Demo {
    public static void show() {
        Customer customer = new Customer();
        Restaurant restaurant = new Restaurant();
        FoodOrderMediator mediator = new ConcreteFoodOrderMediator(customer, restaurant);

        customer.setMediator(mediator);

        customer.order("Burger");
    }
}
