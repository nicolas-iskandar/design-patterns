package Prototype.Example;

public class TurkeyClubSandwich extends BaseSandwich {
    public TurkeyClubSandwich() {
        setName("Turkey Club Sandwich");
        setBreadType("Sourdough");
        getFillings().add("Turkey");
        getFillings().add("Bacon");
        getFillings().add("Lettuce");
        getFillings().add("Tomato");
        getCondiments().add("Mayonnaise");
        getCondiments().add("Mustard");
        setToasted(true);
    }
}
