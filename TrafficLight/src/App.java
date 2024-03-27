public class App {
    // user space for the TrafficLight class
    public static void main(String[] args) {

        TrafficLight l1 = new TrafficLight(TrafficLight.LightColor.RED);
        System.out.println(l1); // Red

        l1.gotoNextColor();

        System.out.println(l1); // Green

        l1.gotoNextColor();
        TrafficLight.LightColor x = TrafficLight.LightColor.GREEN;
        System.out.println(l1); // Yellow

        l1.gotoNextColor();

        System.out.println(l1); // Red

    }
}
