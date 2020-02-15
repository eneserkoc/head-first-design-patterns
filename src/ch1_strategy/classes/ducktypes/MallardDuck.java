package ch1_strategy.classes.ducktypes;

import ch1_strategy.classes.Duck;
import ch1_strategy.classes.flytypes.FlyWithWings;
import ch1_strategy.classes.quacktypes.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }
}
