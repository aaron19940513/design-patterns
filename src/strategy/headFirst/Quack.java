package strategy.headFirst;

/**
 * @author sam
 * @date 2019/7/5 14:19
 */
public class Quack implements  QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack");
    }
}
