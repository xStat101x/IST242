import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        /**
         * <h1>Use the overarching abstract class when possible assuming
         * you don't need any of the subclass specific methods</h1>
         */
        Student m1 = new Student("s1", 34, 3.4);
        AbsMammal m2 = new Student("s2", 20, 4.0);
        AbsMammal m3 = new Student("s3", 25, .25);
        AbsMammal m4 = new Student("s4", 45, 1.5);

        System.out.println(m1);

        ArrayList<IPest> pests = new ArrayList<>();

        pests.add(new Telemarketer("t1", 34));
        pests.add(new HouseFly(2));

        for (IPest p : pests) {
            System.out.println(p.beAnnoying());
        }
    }
}
