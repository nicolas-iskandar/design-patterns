package Command.Example;

public class Demo {
    public static void show() {
        Chef chef = new Chef();

        Command pizzaOrder = new MakePizzaCommand(chef);
        Command pastaOrder = new MakePastaCommand(chef);

        Waiter waiter = new Waiter();

        waiter.takeOrder(pizzaOrder);
        waiter.placeOrder();

        waiter.takeOrder(pastaOrder);
        waiter.placeOrder();
    }
}
