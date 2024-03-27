import controller.HelloWorldController;
import model.MessageModel;
import view.HelloWorldGui;

public class App {

    public static void main(String[] args) {

        HelloWorldGui view = new HelloWorldGui();

        MessageModel mdl = new MessageModel();
        view.setVisible(true);

        HelloWorldController cnt =
                new HelloWorldController(mdl, view);
    }
}
