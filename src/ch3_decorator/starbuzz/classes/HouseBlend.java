package ch3_decorator.starbuzz.classes;

import ch3_decorator.starbuzz.interfaces.Beverage;

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
