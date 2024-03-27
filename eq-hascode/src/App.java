public class App {
    public static void main(String[] args) {


        Person p1 = new Person("joe", 20);
        Person p2 = new Person("joe", 25);

        if (p1.equals(p2)) {
            System.out.println("yes eq...");
        } else {
            System.out.println("no, not eq...");
        }

        Pet pt1 = new Dog("roofus", 3, true);
        Pet pt2 = new Dog("echo", 5, false);
        Pet pt3 = new Dog("roofus", 3, true);

        if (pt1 instanceof Dog o) {
            System.out.println("yes pt1 is a dog");
            System.out.println("and it likes fetch? " + o.isLikesFetch());
        }



        PetDescriber describer2000  = new PetDescriber();

        Pet p = new GoldFish ( " gloopy " , 5);
        String Describer = describer2000.Describe(p);
        System.out.println(Describer);

        p = new Dog ( " echo " , 4 , true );
        System.out.println(describer2000.Describe(p));

        if (pt1.equals(pt2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        if (pt1.equals(pt3)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
