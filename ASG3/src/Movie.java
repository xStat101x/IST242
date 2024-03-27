import java.util.ArrayList;

public class Movie implements Comparable<Movie>  {

    // Fields
    private String title;
    private Director director;
    private Producer producer;
    private int releaseYear;
    private MPAARating rating;
    private ArrayList<Actor> actors;
    private MovieGenre genre;

    // Compare to method to compare one movie to another based on release year
    @Override
    public int compareTo(Movie o) {
        return this.releaseYear - o.releaseYear;
    }

    /**
     * Constructor that stores the passed in values in the fields and creates a movie object
     * @param title movie's title
     * @param director movie's director
     * @param producer movie's producer
     * @param releaseYear movie's release year
     * @param rating movie's rating
     * @param genre movie's genre
     */
    public Movie(String title, Director director, Producer producer,
                 int releaseYear, MPAARating rating, MovieGenre genre) {
        this.title = title;
        this.director = director;
        this.producer = producer;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.genre = genre;
        this.actors = new ArrayList<>();
        if (!producer.specializesInGenre(genre) || !director.specializesInGenre(genre)) {
            throw new IllegalArgumentException("The Producer or Director don't match the genre");
        }
    }

    /**
     * Checks to see if the actor specializes in the movie's genre
     * then adds the actor to the actors arraylist
     * @param actor the actor being added to the arraylist
     * @throws IllegalArgumentException if the actor doesn't specialize in the movie's genre
     */
    public void addActor(Actor actor) {
        if (!actor.specializesInGenre(this.genre)) {
            throw new IllegalArgumentException("The actor don't match the genre");
        }
        actors.add(actor);
    }

    // Getter Methods
    public String getTitle() {
        return title;
    }
    public Director getDirector() {
        return director;
    }
    public Producer getProducer() {
        return producer;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public MPAARating getRating() {
        return rating;
    }
    public ArrayList<Actor> getActors() {
        return actors;
    }
    public MovieGenre getGenre() {
        return genre;
    }


    // To String method
    @Override
    public String toString() {
        return "(" + releaseYear + ") " + title + " - " + genre + " - rated: " + rating;
    }
}
