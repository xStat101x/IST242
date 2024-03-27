public class Actor {

    private int age;
    private String first_name;
    private String last_name;

    /**
     * it validates the age variable then stores all the variables in their correct locations
     * @param age age of actor
     * @param first_name first name
     * @param last_name last name
     */
    public Actor(int age, String first_name, String last_name) {
        validateAge(age);
        this.age = age;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    /**
     * validates that age is a possible age
     * @param age the age of the actor
     */
    public void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age isn't a valid input");
        }
    }

    /**
     * increments the age variable
     */
    public void updateAge(){
        this.age++;
    }

    public String toString() {
        return "Actor: " + this.first_name + ", " + this.last_name + " (" + this.age + ")";
    }

    public int getAge() {
        return age;
    }
    public String getFirst_name() {
        return first_name;
    }
    public String getLast_name() {
        return last_name;
    }
}
