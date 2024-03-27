public abstract class AbsMammal {

    private String name;
    private int age;

    public AbsMammal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public abstract String makeSound();


    public java.lang.String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }


}
