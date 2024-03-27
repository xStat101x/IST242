import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Tester {
    public static void main(String[] args) {

        ArrayList<String> awards1 = new ArrayList<>();
        ArrayList<String> awards2 = new ArrayList<>();
        ArrayList<String> awards3 = new ArrayList<>();

        awards2.add("goodjob");
        awards2.add("nicejob");
        awards2.add("greatjob");

        awards3.add("goodjob");
        awards3.add("nicejob");



        Actor a1 = new Actor("James", "Ratlif", 3, awards1, Actor.ActingStyle.IMPROV);
        Actor a2 = new Actor("Bob", "Cameron", 12, awards3, Actor.ActingStyle.CHARACTER);
        Actor a3 = new Actor("Rex", "Kenyon", 32, awards2, Actor.ActingStyle.IMPROV);
        Actor a4 = new Actor("George", "Bush", 8, awards1, Actor.ActingStyle.METHOD);

        Director d1 = new Director("Ralf", "Emerson", 42, awards1, false);
        Director d2 = new Director("Greg", "Curtis", 2, awards1, true);
        Director d3 = new Director("Alexis", "Ahner", 13, awards3, false);
        Director d4 = new Director("Monkey", "Michels", 150, awards2, true);

        Producer p1 = new Producer("Ben", "Rosenberg", 2, awards1);
        Producer p2 = new Producer("Hayden", "Hubert", 58, awards3);
        Producer p3 = new Producer("Luke", "Melnick", 6, awards2);
        Producer p4 = new Producer("Sean", "Beechy", 1, awards2);

        Movie m1 = new Movie("Actack on the Squirels", d1, p1, 1986, MPAARating.PG, MovieGenre.DRAMA);
        Movie m2 = new Movie("Revenge of the Bunnies", d2, p2, 2014, MPAARating.R, MovieGenre.ROMANCE);
        Movie m3 = new Movie("That sucks the musical", d3, p3, 2024, MPAARating.G, MovieGenre.HORROR);
        Movie m4 = new Movie("Bedtime Revenge Procrastination", d4, p4, 2001, MPAARating.PG13, MovieGenre.COMEDY);

        ArrayList<Movie> myMovies = new ArrayList<>();

        myMovies.add(m1);
        myMovies.add(m2);
        myMovies.add(m3);
        myMovies.add(m4);

        System.out.println("Before Sorting:");
        for (Movie myMovie : myMovies) {
            System.out.println(myMovie);
        }
        System.out.println("-----------------------------------------------------");
        Collections.sort(myMovies);
        System.out.println("After Sorting:");
        for (Movie myMovie : myMovies) {
            System.out.println(myMovie);
        }
    }
}
