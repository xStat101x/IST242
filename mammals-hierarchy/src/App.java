import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        AbsMammal m1 = new Student("s1", 34, 3.4);
        AbsMammal m2 = new Student("s2", 20, 4.0);
        AbsMammal m3 = new Student("s3", 25, .25);
        AbsMammal m4 = new Student("s4", 45, 1.5);

        System.out.println(m1);

        ArrayList<IPest> pests = new ArrayList<>();
        pests.add(new Telemarketer("sds", 3));
        pests.add(new HouseFly(3));

        for (IPest p : pests) {
            System.out.println(p.beAnnoying());
        }

        System.out.println("----------------- ");

        AbsMammal d1 = new Dog("roofus", 3, true);
        AbsMammal s1 = new Student("jerry", 90, 4.0);
        AbsMammal mx = new Telemarketer("howard", 4);

        System.out.println(d1);
        System.out.println(s1);
        System.out.println(mx);

    }
}
