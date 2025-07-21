package Prototype.Example;

public class BLTSandwich extends BaseSandwich {
    public BLTSandwich() {
        setName("BLT Sandwich");
        setBreadType("White");
        getFillings().add("Bacon");
        getFillings().add("Lettuce");
        getFillings().add("Tomato");
        getCondiments().add("Mayonnaise");
        setToasted(true);
    }
}
