import java.util.ArrayList;
import java.util.Scanner;

public class Part1 {

    /**
     * Prompts user for name of a song and returns said name
     * @return user inputted name of song
     */
    public static String nameOfSong() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input the name of the song:");
        return scan.nextLine();
    }

    /**
     * Asks user for the release date of their song
     * then checks to make sure the year is valid
     * @return validated year
     */
    public static int dateOfRelease() {
        Scanner scan = new Scanner(System.in);

        int input = 0;
        boolean isValid = false;

        System.out.println("Please input the release year for your song:");

        while (!isValid) {
            input = scan.nextInt();
            if (input > 0 && input <= 2024) {
                isValid = true;
            }
            System.out.println("Year entered isn't valid please try again:");
        }

        return input;
    }

    /**
     * Asks user for a list of writers that made their song
     * stores them in an arraylist and quits when they type quit
     * @return the arraylist full of writers
     */
    public static ArrayList<String> writers() {
        Scanner scan = new Scanner(System.in);

        boolean end = false;
        ArrayList<String> output = new ArrayList<>();

        System.out.println("Please enter the writers of your song.");
        System.out.println("Type 'quit' when you are finished.");
        while(!end) {
            String temp = scan.next();
            if (temp.equals("quit")) {
                end = true;
            } else {
                output.add(temp);
            }
        }
        return output;
    }

    /**
     * Takes in all the information for a song then prints it
     * @param name name of song
     * @param released date of release
     * @param writers arraylist of writers for song
     */
    public static void formatted(String name, int released, ArrayList<String> writers) {
        System.out.println(name);
        for (int i = 0; i < name.length(); i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println("Released: ");
        System.out.println(released);
        System.out.println("Written by: ");
        for (int i = 0; i < writers.size(); i++) {
            System.out.println(writers.get(i));
        }
    }

    public static void main(String[] args) {
        String songName = nameOfSong();
        formatted(songName, dateOfRelease(), writers());
    }
}
