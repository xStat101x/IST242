package controller;

import model.MessageModel;
import view.HelloWorldGui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldController {

    private MessageModel model;
    private HelloWorldGui view;

    public HelloWorldController(MessageModel m,
                                HelloWorldGui v) {
        this.model = m;
        this.view = v;

        view.textLabel.setText(m.getMsg());

        view.reverseTextButton.addActionListener(new ReverseTextButtonListener());

        view.submitNumberButton.addActionListener(new SubmitNumberButtonListener());
    }
    private class ReverseTextButtonListener implements ActionListener {
        public ReverseTextButtonListener() {}

        @Override public void actionPerformed(ActionEvent e) {
            System.out.println("REVERSE TEXT BUTTON PRESSED!");


            model.setMsg(view.textLabel.getText());
            model.reverseMsg();
            view.textLabel.setText(model.getMsg());


            // TODO: think about what you need to do to reverse the text
            //  stored in the generalTextField (in the view)
            //  NEXT: update the model based on that text and reverse it...
            //      using the MessageModel
            //  Last: update the text field in response to the model changing (reversed the text)
        }
    }

    private class SubmitNumberButtonListener implements ActionListener {
        public SubmitNumberButtonListener () {}

        @Override public void actionPerformed(ActionEvent e) {
            System.out.println("STUFF");

            model.setMsg(model.getMsg() + view.numberTextField.getText());
            view.textLabel.setText(model.getMsg());
        }
    }
}
