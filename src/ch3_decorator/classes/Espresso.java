package ch3_decorator.classes;

import ch3_decorator.interfaces.Beverage;

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
