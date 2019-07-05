package strategy.headFirst;

/**
 * @author sam
 * @date 2019/7/5 14:15
 */
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I am can fly!");
    }
}
