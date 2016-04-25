package skarb_finder.movingStrategy;

/**
 * Created by Beata Iłowiecka on 25.04.16.
 */
public class MovingStrategyFactory {

    public static MovingStrategy create(int direction) throws IllegalArgumentException {
        switch(direction) {
            case 0:
                return new MoveNorth();
            case 1:
                return new MoveSouth();
            case 2:
                return new MoveWest();
            case 3:
                return new MoveEast();
        }
        throw new IllegalArgumentException("Prawdziwi podróżnicy nie poruszają się w tym kierunku.");
    }
}
