import java.util.ArrayList;

public class Student implements CanvasUser {
    private int id;
    private String name;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
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
        output.add(AccessLevel.student);
        return output;
    }


}
