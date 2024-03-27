import control.DogAppController;
import model.DogBasket;
import view.DogAppView;

public class App {

    public static void main(String[] args) {
        DogAppView view = new DogAppView();

        DogBasket model = new DogBasket();


        DogAppController controller =
                new DogAppController(view, model);
        view.setVisible(true);


    }
}
