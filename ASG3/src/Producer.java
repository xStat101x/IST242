import java.util.ArrayList;

public class Producer extends FilmIndustryWorker{

    /**
     * Constructor that creates a producer object and supers up the info
     * to the FilmIndustryWorker abstract class
     * @param firstName Producers first name
     * @param lastName Producers last name
     * @param yearsActive Producers years worked
     * @param awards Producers awards
     */
    public Producer(String firstName, String lastName,
                    int yearsActive, ArrayList<String> awards) {
        super(firstName, lastName, yearsActive, awards);
    }

    /**
     * Determines if a producer can specialize in the genre provided
     * @param movieGenre the movie genre that is passed in
     * @return true if the producer can specialize in the genre depending on genre and years of experience
     */
    @Override
    boolean specializesInGenre(MovieGenre movieGenre) {
        if (movieGenre != MovieGenre.SCIFI) {
            return true;
        } else if (super.yearsActive > 5) {
            return true;
        } else {
            return false;
        }
    }
}
