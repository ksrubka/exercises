package test._4_interfaces.game.eating;

/**
 * Created by Beata Iłowiecka on 14.06.16.
 */
public class Carnivorous implements EatingStrategy  {

    String iEat;

    public Carnivorous(String eats) {
        this.iEat = eats;
    }

    @Override
    public String eat(String eats) {
        EatingStrategyFactory.checkIfICanEat(eats, this.getClass());
        return "Eating " + eats;
    }

    @Override
    public String eat() {
        return "Eating meat, especially i like " + iEat;
    }
}
