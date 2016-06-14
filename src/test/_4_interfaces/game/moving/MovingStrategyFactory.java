package test._4_interfaces.game.moving;

/**
 * Created by Beata Iłowiecka on 14.06.16.
 */
public class MovingStrategyFactory {

    public static MovingStrategy create(Moving movingType) {
        switch (movingType) {
            case RUN:
                return new Running();
            case SWIM:
                return new Swimming();
            case FLY:
                return new Flying();
        }
        throw new IllegalArgumentException("No such model with moving type: " + movingType);
    }
}
