package ch1_strategy.classes;

import ch1_strategy.interfaces.QuackBehaviour;

public class DuckCall {

    QuackBehaviour quackBehaviour;

    public DuckCall(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
