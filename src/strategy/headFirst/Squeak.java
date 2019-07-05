package strategy.headFirst;

/**
 * @author sam
 * @date 2019/7/5 14:19
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("squeak");
    }
}
