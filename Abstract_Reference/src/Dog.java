public class Dog extends AbsMammal{

    private boolean likesFetch;
    public Dog(String name, int age,
               boolean likesFetch) {
        super(name, age);
        this.likesFetch = likesFetch;
    }

    public boolean likesFetch() {return likesFetch;}
    public String makeSound() {
        return "woof";
    }
}
