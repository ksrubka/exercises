package test._4_interfaces.game;

import test._4_interfaces.game.eating.EatingStrategy;
import test._4_interfaces.game.eating.EatingStrategyFactory;
import test._4_interfaces.game.moving.Moving;
import test._4_interfaces.game.moving.MovingStrategy;
import test._4_interfaces.game.moving.MovingStrategyFactory;

/**
 * Created by Beata Iłowiecka on 14.06.16.
 */
public class AnimalFactory {

    public static Animal create(String name, String eats, Moving movingType) {
        EatingStrategy eatingStrategy = EatingStrategyFactory.create(eats);
        MovingStrategy movingStrategy = MovingStrategyFactory.create(movingType);
        return new Animal(name, eatingStrategy, movingStrategy);
    }
}
