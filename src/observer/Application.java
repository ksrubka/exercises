package observer;

import mvc.Controller;
import mvc.Model;

import javax.swing.*;

/**
 * Created by Beata Iłowiecka on 01.06.16.
 */
public class Application {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                runApp();
            }
        });
    }

    public static void runApp() {
        View view = new View();
    }
}



















































