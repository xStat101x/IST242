import java.util.ArrayList;
import java.util.Scanner;

public class Day1_Practice {

    public static void main(String[] args) {

        // first: we'll print Hello Marz

        String msg = "Hello Marz";

        System.out.println(msg);

        //  0123456789
        // "Hello Marz"

        /*
        System.out.println(msg.substring(0, 5));

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter name, followed by age:");
        String name = scan.next();
        int age = scan.nextInt();
        */
        int age = 89;
        String name = "Rex";

        // if-else stmts
        if (age > 30) {
            System.out.println("you're old!" + name);
        } else {
            System.out.println("you're not old, " + name + "...");
        }
        System.out.println("3 " + 2); // "3 2"

        // iteration: while loop and for-loop

        // while loops:
        int i = 0;
        while (i < 10) {
            System.out.println("here's i: " + i);
            i++;
        }
        // this loop will iterate for values 0..9

        // ArrayLists

                                                  //     0     1     2     3
        String[] studentNamesArr = new String[4]; // [ null, null, null, null ]
        studentNamesArr[0] = "bob";
        studentNamesArr[1] = "james";
        // [ "bob", "james", null, null ]
        studentNamesArr[3] = "alice";
        // [ "bob", "james", null, "alice" ]

        ArrayList<String> studentNames = new ArrayList<>(); // []

        studentNames.add("bob");   // [ "bob" ]
        studentNames.add("james"); // [ "bob", "james" ]
        studentNames.add("alice"); // [ "bob", "james", "alice" ]

        studentNames.clear(); // []


        ArrayList<Integer> temp = new ArrayList<>();

        temp.add(1);
        temp.size();
        temp.get(1);

    }
}
