public class Student extends AbsMammal {
    private double gpa;

    public Student(String name, int age,
                   double gpa) {
        super(name, age); // super up the name and age
                          // into the superclass (AbsMammal) ctor
        this.gpa = gpa;
    }

    public double getGpa() { return gpa; }

    @Override public String makeSound() {
        return "hello -- i have a question...";
    }

    @Override public String toString() {
        String result = super.toString();
        return result + " (" + gpa + ")";
    }
}
