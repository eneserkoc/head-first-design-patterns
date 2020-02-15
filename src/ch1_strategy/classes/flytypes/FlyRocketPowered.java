package ch1_strategy.classes.flytypes;

import ch1_strategy.interfaces.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("FlyRocketPowered");
    }
}
