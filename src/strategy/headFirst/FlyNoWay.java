package strategy.headFirst;

/**
 * @author sam
 * @date 2019/7/5 14:17
 */
public class FlyNoWay implements FlyBehavior{


    @Override
    public void fly() {
        System.out.println("I can not fly");
    }
}
