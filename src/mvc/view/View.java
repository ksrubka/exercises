package mvc.view;

import mvc.model.Model;

import javax.swing.JFrame;
import java.awt.*;

/**
 * Created by Beata Iłowiecka on 01.06.16.
 */
public class View extends JFrame {

    private Model model;

    public View(Model model) throws HeadlessException {
        super("MVC Demo");
        this.model = model;
    }
}
