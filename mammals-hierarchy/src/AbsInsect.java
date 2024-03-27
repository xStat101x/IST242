public abstract class AbsInsect {

    private int age;
    private boolean canFly;

    public AbsInsect(int age, boolean canFly) {
       this.age = age;
       this.canFly = canFly;
    }

    public boolean canFly() { return canFly; }
    public int getAge() { return age; }

}