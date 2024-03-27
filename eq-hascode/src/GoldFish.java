public class GoldFish extends Pet {

    public GoldFish(String name, int age) {
        super(name, age);
    }

    @Override
    public String doTrick(String cmd) {
        return "glub glub";
    }
}
