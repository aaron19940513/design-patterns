package strategy.headFirst;

/**
 * @author sam
 * @date 2019/7/5 14:23
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I am a real Mallard duck");
    }
}
