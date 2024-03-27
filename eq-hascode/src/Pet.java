public abstract class Pet {

    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String doTrick(String cmd);

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
