public class App {
    public static void main(String[] args) {
        Robot r1 = new Robot();
        r1.move();
        r1.turn(Robot.Direction.South);
        r1.move();
        System.out.println(r1);
    }
}
