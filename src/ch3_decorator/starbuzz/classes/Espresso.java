package ch3_decorator.starbuzz.classes;

import ch3_decorator.starbuzz.interfaces.Beverage;

public class Espresso  implements Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
