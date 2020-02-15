package ch1_strategy.classes.flytypes;

import ch1_strategy.interfaces.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {

    public void fly(){
        System.out.println("FlyWithWings");
    }
}
