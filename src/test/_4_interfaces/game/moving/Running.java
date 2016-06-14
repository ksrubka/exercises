package test._4_interfaces.game.moving;

/**
 * Created by Beata Iłowiecka on 14.06.16.
 */
public class Running implements MovingStrategy {

    @Override
    public String go() {
        return "Running fast!";
    }
}
