import java.util.ArrayList;

public class Director extends FilmIndustryWorker{
    // Fields
    private boolean usesDigital;

    /**
     * Constructor that supers up the passed in fields to the FilmIndustryWorker Class
     * and stores weather they use digital film as a boolean
     * @param firstName Director's first name
     * @param lastName Director's last name
     * @param yearsActive Director's years in the industry
     * @param awards Director's awards
     * @param usesDigital Director's preferred film type
     */
    public Director(String firstName, String lastName, int yearsActive,
                    ArrayList<String> awards, boolean usesDigital) {
        super(firstName, lastName, yearsActive, awards);
        this.usesDigital = usesDigital;
    }

    /**
     * This overrides the abstract method from FilmIndustryWorker and determines if the director can
     * specialize in the genre that is passed in. In this case a Director can specialize in all cases
     * except if its SCI-FI, and they use film instead of digital denoted by the usesDigital
     * @param movieGenre the movie genre that is passed in
     * @return a boolean if the director can specialize
     */
    @Override
    boolean specializesInGenre(MovieGenre movieGenre) {
        if (movieGenre != MovieGenre.SCIFI) {
            return true;
        } else if (usesDigital) {
            return true;
        } else {
            return false;
        }
    }

    // Getter Methods
    public boolean isUsesDigital() {
        return usesDigital;
    }
}
