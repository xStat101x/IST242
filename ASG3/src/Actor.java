import java.util.ArrayList;

public class Actor extends FilmIndustryWorker{

    // Enum Data Types
    public enum ActingStyle{
        METHOD,
        CHARACTER,
        IMPROV
    }

    // Fields
    private ActingStyle actingStyle;

    /**
     * Takes in a lot of data and supers it up to the FilmIndustryWorker abstract class
     * @param firsName Actors first name
     * @param lastName Actors last name
     * @param yearsActive Actors years in the Industry
     * @param awards Actors Awards
     * @param actingStyle Actors style stored locally
     */
    public Actor(String firsName, String lastName, int yearsActive,
                 ArrayList<String> awards, ActingStyle actingStyle) {
        super(firsName, lastName, yearsActive, awards);
        this.actingStyle = actingStyle;
    }

    /**
     * Checks to see if an Actor can specialize in a specific genre depending on years
     * and acting style as well as which genre they want to specialize in
     * @param movieGenre the movie genre that is passed in
     * @return true if the actor can specialize in it
     */
    @Override
    boolean specializesInGenre(MovieGenre movieGenre) {
        if (movieGenre.equals(MovieGenre.ACTION) || movieGenre.equals(MovieGenre.ROMANCE)) {
            return true;
        } else if (movieGenre.equals(MovieGenre.HORROR) || movieGenre.equals(MovieGenre.SCIFI)) {
            if (super.yearsActive > 10) {
                return true;
            } else {
                return false;
            }
        } else {
            if (actingStyle.equals(ActingStyle.IMPROV)) {
                return true;
            } else {
                return false;
            }
        }
    }

    // Getter Methods
    public ActingStyle getActingStyle(){
        return actingStyle;
    }
}
