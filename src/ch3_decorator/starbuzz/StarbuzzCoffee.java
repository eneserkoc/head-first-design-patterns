package ch3_decorator.starbuzz;

import ch3_decorator.starbuzz.classes.HouseBlend;
import ch3_decorator.starbuzz.classes.Mocha;
import ch3_decorator.starbuzz.classes.Whip;
import ch3_decorator.starbuzz.interfaces.Beverage;

public class StarbuzzCoffee {

    public static void main(String[] args){

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);

        System.out.println(beverage1.getDescription()
                +  " $" + beverage1.cost());

    }
}