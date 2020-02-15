import ch1_strategy.classes.Duck;
import ch1_strategy.classes.DuckCall;
import ch1_strategy.classes.ducktypes.MallardDuck;
import ch1_strategy.classes.ducktypes.ModelDuck;
import ch1_strategy.classes.flytypes.FlyRocketPowered;
import ch1_strategy.classes.quacktypes.MuteQuack;
import ch1_strategy.classes.quacktypes.Quack;

public class MiniDuckSimulator {

    public static void main(String[] args){
        Duck mallardDuck = new MallardDuck();

        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();

        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();

        System.out.println("test");
        DuckCall duckCall = new DuckCall(new MuteQuack());
        //duckCall.setQuackBehaviour(new MuteQuack());
        duckCall.performQuack();
        duckCall.setQuackBehaviour(new Quack());
        duckCall.performQuack();

    }
}
