package ch3_decorator;

import ch3_decorator.classes.HouseBlend;
import ch3_decorator.classes.Mocha;
import ch3_decorator.classes.Whip;
import ch3_decorator.interfaces.Beverage;

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