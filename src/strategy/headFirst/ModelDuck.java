package strategy.headFirst;

/**
 * @author sam
 * @date 2019/7/5 14:34
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }


    @Override
    void display() {
        System.out.println("I am a model duck");
    }

}
