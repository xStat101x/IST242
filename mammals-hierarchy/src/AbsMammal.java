public abstract class AbsMammal extends Object {
    private String name;
    private int age;

    public AbsMammal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String makeSound();

    @Override public String toString() {
        return getClass().getName() + ": " + name + ", " + age;
    }
}
