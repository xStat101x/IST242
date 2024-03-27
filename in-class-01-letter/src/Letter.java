import java.util.ArrayList;

public class Letter {

    // fields/attributes:
    private String from;
    private String to;
    private ArrayList<String> lines;

    // default constructor
    public Letter() {
        this.from = "N/A";
        this.to = "N/A";
        this.lines = new ArrayList<>();
    }

    //constructor
    public Letter(String from, String to) {
        this.from = from;
        this.to = to;
        this.lines = new ArrayList<>();
    }
    //Mutators
    public void newFrom(String from) {
        this.from = from;
    }
    public void newTo(String to) {
        this.to = to;
    }

    //Getters
    public String getFrom() {
        return from;
    }
    public String getTo() {
        return to;
    }
    public ArrayList<String> getLines() {
        return lines;
    }

    @Override
    public String toString() {
        return "A letter " + this.from + " --> " + this.to;
    }
    public void addLine(String input) {
        this.lines.add(input);
    }
    public String getText() {
        String output = "Dear " + this.to + ",\n\n";
        for (String line : lines) {
            output += line + "\n";
        }
        output += "\n" + "Sincerely, \n" + this.from;
        return output;
    }

}
