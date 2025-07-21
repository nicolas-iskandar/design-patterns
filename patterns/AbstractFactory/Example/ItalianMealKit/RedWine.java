package AbstractFactory.Example.ItalianMealKit;


import AbstractFactory.Example.Drink;

public class RedWine implements Drink {
    @Override
    public String getDrinkName() {
        return "Red Wine";
    }

    @Override
    public String describeDrink() {
        return "A deep, velvety red with notes of cherry, oak, and just enough boldness to make you say 'Salute!'";
    }

    @Override
    public void serveDrink() {
        System.out.println("A glass of bold Italian red—swirl, sniff, sip, and say ‘cin cin!’");
    }

    @Override
    public boolean isAlcoholic() {
        return true;
    }
}
