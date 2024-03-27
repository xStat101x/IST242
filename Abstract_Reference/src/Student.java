public class Student extends AbsMammal{
    private double gpa;

    public Student(String name, int age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }


    public String makeSound() {
        return "Screams from insanity";
    }

    public double getGpa() {return gpa;}
    @Override
    public String toString() {
        return "Studnet: " + this.getName() + " (gpa: " + this.gpa + ")";

    }
}
