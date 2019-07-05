package strategy.headFirst;

/**
 * @author sam
 * @date 2019/7/5 14:36
 */
public class FlyRocketPowered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I am flying with a rocket!");
    }
}
