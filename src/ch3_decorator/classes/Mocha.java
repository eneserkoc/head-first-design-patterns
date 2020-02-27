package ch3_decorator.classes;

import ch3_decorator.interfaces.Beverage;

public class Mocha implements Beverage {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() +", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
