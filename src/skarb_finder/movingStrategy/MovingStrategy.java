package skarb_finder.movingStrategy;

import skarb_finder.SkarbFinder;

/**
 * Created by Beata Iłowiecka on 25.04.16.
 */
public interface MovingStrategy {

    public void go(int steps, SkarbFinder.MyPoint position);
}
