package skarb_finder.movingStrategy;

import skarb_finder.SkarbFinder;

import java.awt.*;

/**
 * Created by Beata Iłowiecka on 25.04.16.
 */
public class MoveNorth implements MovingStrategy  {

    @Override
    public void go(int steps, SkarbFinder.MyPoint position) {
        position.addToX(steps);
    }
}
