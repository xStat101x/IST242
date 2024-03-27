public abstract class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract Respond doTrick(Command cmd);

    public String toString(){
        return "Pet: " + this.name + " , age: " + this.age;
    }
}

class Dog extends Pet {
    private boolean likesFetch;
    public Respond doTrick(Command cmd) {
        if (cmd == Command.SITS) {
            return Respond.SITS;
        } else if (cmd == Command.FETCH && likesFetch) {
            return Respond.FETCHES;
        } else {
            return Respond.DOES_NOTHING;
        }
    }
    public Dog(String name, int age, boolean likesFetch) {
        super(name, age);
        this.likesFetch = likesFetch;
    }
}

class GoldFish extends Pet {

    public Respond doTrick(Command cmd) {
        if (cmd == Command.JUMP_THROUGH_FIREY_HOOP) {
            return Respond.JUMPS_THROUGH_FIREY_HOOP;
        } else {
            return Respond.DOES_NOTHING;
        }
    }

    public GoldFish(String name, int age) {
        super(name, age);
    }
}