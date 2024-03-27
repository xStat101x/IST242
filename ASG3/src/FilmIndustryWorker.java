import java.util.ArrayList;

abstract class FilmIndustryWorker {
    // Fields
    String firstName;
    String lastName;
    int yearsActive;
    ArrayList<String> awardsWon;


    /**
     * This is an abstract method used to show if a worker can specialize in the genre
     * depending on what is passed in to it
     * @param movieGenre the movie genre that is passed in
     * @return a true or false if they can or can't specialize in said genre
     */
    abstract boolean specializesInGenre(MovieGenre movieGenre);

    /**
     * Constructor that stores the fields passed into it by super
     * @param firstName a workers first name
     * @param lastName a workers last name
     * @param yearsActive the years the worker has been active
     * @param awardsWon any awards the worker has won
     */
    public FilmIndustryWorker (String firstName, String lastName,
                               int yearsActive, ArrayList<String> awardsWon) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearsActive = yearsActive;
        this.awardsWon = awardsWon;
    }

    // Getter Methods
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getYearsActive() {
        return yearsActive;
    }
    public ArrayList<String> getAwardsWon() {
        return awardsWon;
    }

    // To String Method
    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + yearsActive + ")";
    }
}
