package mvc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Beata Iłowiecka on 01.06.16.
 */
public class View extends JFrame implements ActionListener {

    private Model model;
    private LoginListener loginListener;
    private JButton okButton;
    private JTextField nameField;
    private JPasswordField passField;

    public View(Model model) throws HeadlessException {
        super("MVC Demo");
        this.model = model;
        nameField = new JTextField(10);
        passField = new JPasswordField(10);
        okButton = new JButton("OK");
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        //nameField
        gbc.anchor = GridBagConstraints.LAST_LINE_END;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.insets = new Insets(100, 0, 0, 10);
        gbc.fill = GridBagConstraints.NONE;

        add(new JLabel("Name: "), gbc);

        gbc.anchor = GridBagConstraints.LAST_LINE_START;
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.insets = new Insets(100, 0, 0, 0);
        gbc.fill = GridBagConstraints.NONE;

        add(nameField, gbc);

        //passField
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.insets = new Insets(0, 0, 0, 10);
        gbc.fill = GridBagConstraints.NONE;

        add(new JLabel("Password: "), gbc);

        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.insets = new Insets(0, 0, 0, 0);
        gbc.fill = GridBagConstraints.NONE;
        add(okButton, gbc);

        add(passField, gbc);

        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.weightx = 1;
        gbc.weighty = 100;
        gbc.fill = GridBagConstraints.NONE;

        add(okButton, gbc);
        okButton.addActionListener(this);

        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String password = new String(passField.getPassword());
        String name = nameField.getText();
        if (loginListener != null)
            loginListener.loginPerformed(new LoginFormEvent(name, password));
        //System.out.println("name: " + name + "\n" + "password: " + password);
    }

    public void setLoginListener(LoginListener loginListener) {
        this.loginListener = loginListener;
    }
}