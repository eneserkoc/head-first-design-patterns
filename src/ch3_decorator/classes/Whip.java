package ch3_decorator.classes;

import ch3_decorator.interfaces.Beverage;

public class Whip implements Beverage {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() +", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
