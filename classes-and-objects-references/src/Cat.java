public class Cat {

    // define some attributes/fields

    private String name;
    private int age;
    private boolean likesTuna; // does the cat like tuna ? true/false

    // constructor (ctor)
    public Cat(String name, int age, boolean tunaFan) {
        validateNameAndAge(name, age); // run this in ctor instead of getter
        // because this method will be run getter might not be
        this.name = name;
        this.age = age;
        this.likesTuna = tunaFan;
    }

    // mutator/settor method
    // less mutator methods the better
    // these aren't entirely necessary all the time...
    public void setName(String newName) {
        this.name = newName;
    }

    public void incrementAge(){
        this.age++;
    }

    // getter method example
    public String getName() {
        return this.name;
    }

    public boolean isLikesTuna() {
        return likesTuna;
    }

    private void validateNameAndAge(String potentialName, int potentialAge) {
        if (potentialName.isBlank() || potentialAge < 0) {
            throw new IllegalArgumentException("invalid name or age!");
        }
    }

    // overriding toString to provide a human-readable
    // representation of this cat.
    public String toString() {
        return "name: " + name + ", age: " + age + " likesTuna ? " + likesTuna;
    }
}
