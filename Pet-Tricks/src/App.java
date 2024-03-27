import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Dog d1 = new Dog("roofus", 5, false);
        GoldFish g1 = new GoldFish("gloopy", 1);
        Dog d2 = new Dog("echo", 12, true);

        ArrayList<Pet> list1 = new ArrayList<>();

        list1.add(d1);
        list1.add(g1);
        list1.add(d2);

        for (Pet pet : list1) {
            System.out.println(pet);
            System.out.println(
                    pet.doTrick(Command.JUMP_THROUGH_FIREY_HOOP)
            );
            System.out.println(pet.doTrick(Command.SITS));
            System.out.println(pet.doTrick(Command.FETCH));
        }
    }
}
