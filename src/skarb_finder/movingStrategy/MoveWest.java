package skarb_finder.movingStrategy;

import skarb_finder.SkarbFinder;

/**
 * Created by Beata Iłowiecka on 25.04.16.
 */
public class MoveWest implements MovingStrategy {

    @Override
    public void go(int steps, SkarbFinder.MyPoint position) {
        position.subtractFromY(steps);
    }
}
