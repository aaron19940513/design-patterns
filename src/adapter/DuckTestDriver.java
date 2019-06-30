package adapter;

public class DuckTestDriver {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The turkey says:");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("The Duck says:");
        testDuck(mallardDuck);

        System.out.println("The turkeyAdapter says:");
        testDuck(turkeyAdapter);

    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
