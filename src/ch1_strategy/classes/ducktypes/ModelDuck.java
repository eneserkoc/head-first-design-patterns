package ch1_strategy.classes.ducktypes;

import ch1_strategy.classes.Duck;
import ch1_strategy.classes.flytypes.FlyNoWay;
import ch1_strategy.classes.quacktypes.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }
}
