package view;

import javax.swing.*;
import java.awt.*;

public class DogAppView extends JFrame {

    public JTextField nameField;
    public JTextField ageField;
    public JButton addButton;
    public JLabel dogsCountLabel;

    public DogAppView() {

        super("Dog Gui");

        setLayout(new FlowLayout());

        nameField = new JTextField("", 10);
        ageField = new JTextField("", 3);
        addButton = new JButton("Add Dog to Collection");
        dogsCountLabel = new JLabel("Dogs: ");


        add(new JLabel("Name: "));
        add(nameField);
        add(new JLabel("Age: "));
        add(ageField);
        add(addButton);
        add(dogsCountLabel);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
    }
}
