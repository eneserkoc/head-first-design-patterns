package ch1_strategy.classes.flytypes;

import ch1_strategy.interfaces.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {

    public void fly(){
        System.out.println("FlyNoWay");
    }
}
