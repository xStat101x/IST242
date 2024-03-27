import java.util.ArrayList;

public class Professsor implements CanvasUser {
    private int id;
    private String name;
    private int numOfPapers;

    public Professsor(String name, int id, int NOP) {
        this.id = id;
        this.name = name;
        this.numOfPapers = NOP;
    }

    @Override
    public int id() {
        return this.id;
    }
    @Override
    public String name() {
        return this.name;
    }
    @Override
    public ArrayList<AccessLevel> role() {
        ArrayList<AccessLevel> output = new ArrayList<>();
        output.add(AccessLevel.instructor);
        output.add(AccessLevel.admin);
        return output;
    }
}
