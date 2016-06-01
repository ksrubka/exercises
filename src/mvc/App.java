package mvc;

import javax.swing.*;

/**
 * Created by Beata Iłowiecka on 01.06.16.
 */
public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                runApp();
            }
        });
    }

    public static void runApp() {
        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(model, view);
    }
}

