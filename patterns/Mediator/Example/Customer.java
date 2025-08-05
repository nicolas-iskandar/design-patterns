package Mediator.Example;

class Customer {
    private FoodOrderMediator mediator;

    public void setMediator(FoodOrderMediator mediator) {
        this.mediator = mediator;
    }

    public void order(String foodItem) {
        if (mediator == null) return;
        System.out.println("Customer: I'd like to order " + foodItem);
        mediator.orderFood(foodItem);
    }

    public void receiveFood(String foodItem) {
        System.out.println("Customer: Received my " + foodItem + "!");
    }
}
