import java.util.ArrayList;

public class Movie {

    private String movie_name;
    private double movie_length;
    private int releaseYear;
    private ArrayList<Actor> actors;
    private ArrayList<Song> songs;
    public enum MPAARating {
        G,
        PG,
        PG13,
        R
    }
    private MPAARating rating;

    /**
     * Creates a movie object and stores all the variables
     * It also has a validation check to make sure releaseYear and movie_length
     * are valid numbers
     * @param name name of the movie
     * @param actors ArrayList of all actors
     * @param songs ArrayList of all songs
     * @param releaseYear the year the movie was released
     * @param rating the movies rating
     * @param movie_length the length of the movie in minutes
     */
    public Movie(String name, ArrayList<Actor> actors,
                 ArrayList<Song> songs, int releaseYear,
                 MPAARating rating, double movie_length) {
        if (releaseYear < 0 || movie_length < 0) {
            throw new IllegalArgumentException("Either the movie length or the release year are invalid" +
                    "inputs. Please enter a non negative number for your input");
        }

        this.movie_name = name;
        this.actors = actors;
        this.songs = songs;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.movie_length = movie_length;
    }

    /**
     * Checks if there is a actor in the arraylist then returns
     * @return a string with the corresponding information
     */
    public String toString() {
        if (actors.isEmpty()) {
            return "Movie: " + movie_name + " ( " + releaseYear + " - " + rating + " )";
        }
        return "Movie: " + movie_name + " ( " + releaseYear + " - " +
                actors.getFirst().getLast_name() + " - "  + rating + " )";
    }

    /**
     * adds an actor to the arraylist of actors
     * @param a the actor
     */
    public void addActor(Actor a) {
        actors.add(a);
    }

    /**
     * adds a song to the arraylist of songs
     * @param s the song
     */
    public void addSong(Song s) {
        songs.add(s);
    }

    public String getMovie_name() {
        return movie_name;
    }
    public double getMovie_length() {
        return movie_length;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public ArrayList<Actor> getActors() {
        return actors;
    }
    public ArrayList<Song> getSongs() {
        return songs;
    }
    public MPAARating getRating() {
        return rating;
    }
}
