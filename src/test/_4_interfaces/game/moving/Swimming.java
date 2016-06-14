package test._4_interfaces.game.moving;

/**
 * Created by Beata Iłowiecka on 14.06.16.
 */
public class Swimming implements MovingStrategy {

    @Override
    public String go() {
        return "Swimming gracefully!";
    }
}
