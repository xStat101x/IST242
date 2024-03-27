public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        // instanceof
        if (o instanceof Person otherPerson) {
            // return tru if this person's name and
            // age match 'otherPerson's
            if (this.name.equals(otherPerson.name) &&
                    this.age == otherPerson.age) {
                return true;
            } else {
                return false;
            }
        }

        return super.equals(o);
    }

    @Override
    public String toString() {
        return name + ":" + age;
    }
}
