package test._4_interfaces.game.eating;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Beata Iłowiecka on 14.06.16.
 */
public class EatingStrategyFactory {

    static List<String> herbs = new ArrayList<>(Arrays.asList("grass", "herbs", "cabbage", "salad", "algae"));
    static List<String> meat = new ArrayList<>(Arrays.asList("meat"));
    static List<String> animals = new ArrayList<>(Arrays.asList("mouse", "bunny", "deer", "zebra"));

    public static EatingStrategy create(String eats) {
        if (herbs.contains(eats))
            return new Herbivorous(eats);
        else if (meat.contains(eats) || animals.contains(eats))
            return new Carnivorous(eats);
        else
            throw new IllegalArgumentException("No such model in application eating " + eats);
    }

    public static boolean checkIfICanEat(String meal, Class eatingStrategy) {
        if (herbs.contains(meal) && eatingStrategy.equals(Herbivorous.class))
            return true;
        if ((meat.contains(meal) || animals.contains(meal)) && eatingStrategy.equals(Carnivorous.class))
            return true;
        else
            throw new IllegalArgumentException("I'm sorry, I don't like " + meal + ". It doesn't serve me well.");
    }
}