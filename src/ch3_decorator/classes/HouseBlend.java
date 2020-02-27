package ch3_decorator.classes;

import ch3_decorator.interfaces.Beverage;

public class HouseBlend implements Beverage {

    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
