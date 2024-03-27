package control;

import model.Dog;
import model.DogBasket;
import view.DogAppView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DogAppController {

    private DogAppView view;
    private DogBasket model;

    public DogAppController(DogAppView v, DogBasket m) {
        this.view = v;
        this.model = m;

        // todo: hook up event handlers for the buttons
        view.addButton.addActionListener(new DogAddButtonListener());

    }

    // inner class
    private class DogAddButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String nameText = view.nameField.getText();
            String ageText = view.ageField.getText();

            if (!validateAge(ageText)) {
                // show an error dialog box
                // stop the listener (return)
                JOptionPane.showMessageDialog(view,"invalid age must be greater then 0");
                return;
            }
            Dog d = new Dog(nameText, Integer.parseInt(ageText));
            model.addDogToBasket(d);
            view.dogsCountLabel.setText("Dogs: " + model.numOfDogsInBasket());
        }
    }

    private boolean validateAge(String ageText) {
        try {
            int theAge = Integer.parseInt(ageText);
            return theAge > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
