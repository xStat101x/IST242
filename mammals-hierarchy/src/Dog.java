public class Dog extends AbsMammal {

    private boolean likesFetch;

    public Dog(String name, int age,
               boolean likesFetch) {
        super(name, age);
        this.likesFetch = likesFetch;
    }

    public boolean likesFetch() {
        return this.likesFetch;
    }

    @Override public String makeSound() {
        return "woof";
    }

    @Override public String toString() {
        String result = super.toString();
        return result + " (likes playing fetch ? " + likesFetch+ ")";
    }
}
