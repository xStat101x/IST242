public class Song {

    private String song_title;
    private String band_name;
    private double song_length;
    private String genre;

    /**
     * Creates a new song object and stores all the correct values in the correct variables
     * @param song_title title of song
     * @param band_name name of band
     * @param song_length length of song in minutes
     * @param genre the genre of the song
     */
    public Song(String song_title, String band_name,
                double song_length, String genre) {
        this.song_title = song_title;
        this.band_name = band_name;
        this.song_length = song_length;
        this.genre = genre;
    }


    /**
     * sets a new band_name just in case it ever changes
     * @param newBandName the new band name
     */
    public void setBandName(String newBandName) {
        this.band_name = newBandName;
    }

    public String getSong_title() {
        return song_title;
    }
    public String getBand_name() {
        return band_name;
    }
    public double getSong_length() {
        return song_length;
    }
    public String getGenre() {
        return genre;
    }


    public String toString(){
        return "Song: " + song_title + " By " + band_name + " (" + genre + ")";
    }
}
