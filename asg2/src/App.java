import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Actor james = new Actor(39, "James", "Smith");
        Song song1 = new Song("Sitting on a Stove", "The 3 Smiths", 2.30, "Rock");
        Actor george = new Actor(27, "George", "Biles");
        Song song2 = new Song("Running through Chernobyl", "The Flys", 2.23, "EDM");

        ArrayList<Actor> a1 = new ArrayList<>();
        ArrayList<Actor> a2 = new ArrayList<>();

        ArrayList<Song> s1 = new ArrayList<>();
        ArrayList<Song> s2 = new ArrayList<>();

        Movie movie1 = new Movie("Life", a1, s1, 2012, Movie.MPAARating.R, 145.23);
        Movie movie2 = new Movie("Plants", a2, s2, 1923, Movie.MPAARating.PG, 110.53);

        movie1.addActor(james);
        movie2.addActor(george);
        movie1.addSong(song1);
        movie2.addSong(song2);

        System.out.println(movie1);
        for (int i = 0; movie1.toString().length() > i ; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println(movie2);
        for (int i = 0; movie2.toString().length() > i ; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
