package adapter;

public class DuckApdater implements Turkey {
    private Duck duck;

    public DuckApdater(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
