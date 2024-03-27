package view;

import javax.swing.*;

public class HelloWorldGui extends JFrame {
    public JButton reverseTextButton;
    public JButton submitNumberButton;
    public JTextField numberTextField;
    public JLabel textLabel;

    public HelloWorldGui() {
        super("Hello World Gui"); // Set the title of the frame

        reverseTextButton = new JButton("Reverse Text");
        submitNumberButton = new JButton("Submit Number");
        numberTextField = new JTextField(10); // Set the width of the text field
        textLabel = new JLabel("Text:");

        // Add the elements to the content pane
        JPanel panel = new JPanel(); // Create a panel to hold the elements
        panel.add(textLabel);
        panel.add(reverseTextButton);
        panel.add(numberTextField);
        panel.add(submitNumberButton);

        this.getContentPane().add(panel); // Add the panel to the content pane of the frame

        // Set the layout of the frame (optional)
        // this.setLayout(new FlowLayout()); // Example layout manager

        pack(); // Adjust the size of the frame to fit the preferred size of its components
    }
}
