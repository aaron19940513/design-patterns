package strategy.headFirst;

/**
 * @author sam
 * @date 2019/7/5 14:20
 */
public abstract class Duck {


    protected FlyBehavior flyBehavior;


    protected QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("All duck float,even decoys!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
