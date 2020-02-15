package ch1_strategy.classes.quacktypes;

import ch1_strategy.interfaces.QuackBehaviour;

public class Squeak implements QuackBehaviour {

    public void quack(){
        System.out.println("Squeak");
    }
}
