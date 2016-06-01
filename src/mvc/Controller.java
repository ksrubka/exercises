package mvc;

/**
 * Created by Beata Iłowiecka on 01.06.16.
 */
public class Controller implements LoginListener {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void loginPerformed(LoginFormEvent event) {
        System.out.println("login event received: " + event.getName() + "; "
        + event.getPassword());

    }
}
