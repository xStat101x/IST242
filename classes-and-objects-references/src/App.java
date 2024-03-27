public class App {


    public static void main(String[] args) {

        // create 2 cat instances... make the first named
        // pepper, and make the second instance named: snowball

        // Creating a Cat instance
        Cat c1 = new Cat("pepper", 3, true);
        // Creating a second Cat instance
        Cat c2 = new Cat("snowball", 15, false);

        System.out.println("Before: " + c1);
        // c1.name = "MOOOOO"; // changes the name (if public)
        c1.setName("MOOOOO"); // better way to update name using mutator method
        c1.incrementAge(); // another example of mutator use
        System.out.println("After: " + c1);

        // c1.validateNameAndAge(); // private cant call

        System.out.println(c1.getName()); // making use of a getter method

        if (c1.isLikesTuna()) {
            System.out.println("cat 1 likes tuna...");
        }

        // setting c1 to reference c2 ( called an alias)
        c1 = c2;

        // Printing where it is located in memory
        System.out.println(c1);
        System.out.println(c2);


    }
}
