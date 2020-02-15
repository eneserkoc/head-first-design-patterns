package ch1_strategy.classes.quacktypes;

import ch1_strategy.interfaces.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {

    public void quack(){
        System.out.println("MuteQuack");
    }

}
