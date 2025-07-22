package Facade.Example;

public class PizzaFacade {
    private final DoughStation doughStation;
    private final SauceStation sauceStation;
    private final ToppingStation toppingStation;
    private final CheeseStation cheeseStation;
    private final OvenStation ovenStation;
    private final PackagingStation packagingStation;

    public PizzaFacade() {
        this.doughStation = new DoughStation();
        this.sauceStation = new SauceStation();
        this.toppingStation = new ToppingStation();
        this.cheeseStation = new CheeseStation();
        this.ovenStation = new OvenStation();
        this.packagingStation = new PackagingStation();
    }

    public void orderMargherita() {
        doughStation.prepareDough();
        doughStation.restDough();
        sauceStation.makeSauce();
        sauceStation.applySauce();
        toppingStation.sliceToppings();
        toppingStation.addToppings();
        cheeseStation.grateCheese();
        cheeseStation.addCheese();
        ovenStation.preheat();
        ovenStation.bakePizza();
        packagingStation.boxPizza();
        System.out.println("Pizza's done!");
    }
}
