package strategy.headFirst;

/**
 * @author sam
 * @date 2019/7/5 14:26
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
