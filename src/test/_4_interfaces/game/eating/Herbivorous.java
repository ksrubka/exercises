package test._4_interfaces.game.eating;

/**
 * Created by Beata Iłowiecka on 14.06.16.
 */
public class Herbivorous implements EatingStrategy {

    String iEat;

    public Herbivorous(String eats) {
        this.iEat = eats;
    }

    @Override
    public String eat(String eats) {
        EatingStrategyFactory.checkIfICanEat(eats, this.getClass());
        return "Eating " + eats;
    }

    @Override
    public String eat() {
        return "Eating herbs, especially i like " + iEat;
    }
}
