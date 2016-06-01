package mvc.view;

import mvc.model.Model;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Beata Iłowiecka on 01.06.16.
 */
public class View extends JFrame {

    private Model model;

    public View(Model model) throws HeadlessException {
        super("MVC Demo");
        this.model = model;

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridheight = 0;
        gbc.gridwidth = 0;
        gbc.weightx = 1;
        gbc.weighty=1;
        gbc.fill= GridBagConstraints.NONE;

        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

























































}
