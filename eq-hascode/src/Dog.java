public class Dog extends Pet {

    private boolean likesFetch;

    public Dog(String name, int age, boolean likesFetch) {
        super(name, age);
        this.likesFetch = likesFetch;
    }

    public boolean isLikesFetch() {
        return likesFetch;
    }

    @Override
    public String doTrick(String cmd) {
        return "does a back flip with style";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dog dog) {
            if (super.getName().equals(dog.getName())
                    && super.getAge() == dog.getAge()
                    && isLikesFetch() == dog.likesFetch) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
