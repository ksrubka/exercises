package observer;

import mvc.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Beata Iłowiecka on 01.06.16.
 */
public class View extends JFrame implements ActionListener {

    private Model model;
    private JButton helloButton;
    private JButton byeButton;
    private JButton niceButton;

    public View(Model model) throws HeadlessException {
        super("MVC Demo");
        this.model = model;
        helloButton = new JButton("I'm the first button!");
        byeButton = new JButton("I'm second!");
        niceButton = new JButton("I'm third");
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        //helloButton
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.NONE;
        add(helloButton, gbc);
        helloButton.addActionListener(this);

        //byeButton
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.NONE;
        add(byeButton, gbc);
        byeButton.addActionListener(this);
        byeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("I'm the first of anonymous messages of a byeButton.");
            }
        });

        //niceButton
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.NONE;
        add(niceButton, gbc);
        niceButton.addActionListener(this);
        niceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("I'm the first of anonymous messages of a niceButton.");
            }
        });
        niceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("I'm the second of anonymous messages of a niceButton.");
            }
        });
        niceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("I'm the third of anonymous messages of a niceButton.");
            }
        });

        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();

        if (source == helloButton)
            System.out.println("First message from this ActionListener - helloButon");
        else if (source == byeButton)
            System.out.println("Second message from this ActionListener - byeButton");
        else
            System.out.println("Third message from this ActionListener - niceButton");
    }
}