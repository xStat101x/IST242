public class Telemarketer extends AbsMammal implements IPest {

    public Telemarketer(String name, int age) {
       super(name, age);
    }

    public String callDuringDinner() {
        return "*ring* oh you're eating! That's great!";
    }

    public String keepTalking() {
        return "wait --- wait -- better offer";
    }

     @Override public String makeSound() {
        return "wait wait --- I have a great deal! *click*";
    }

    @Override public String beAnnoying() {
        return callDuringDinner() + "\n" + keepTalking();
    }

    /*


     */
}
