package mvc;

/**
 * Created by Beata Iłowiecka on 01.06.16.
 */
public class LoginFormEvent {

    private String name;
    private String password;

    public LoginFormEvent(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
