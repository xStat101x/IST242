public class HouseFly extends AbsInsect implements IPest{

    public HouseFly(int age) {
        super(age, true);
    }

    public String makeBuzzSound() {
        return "BZZZZZ";
    }

    public String beAnnoying() {
        return makeBuzzSound();
    }
}
