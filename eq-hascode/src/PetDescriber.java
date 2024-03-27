public class PetDescriber {

    public PetDescriber(){}

    public String Describe(Pet p) {
        if (p instanceof GoldFish goldFish) {
            return "A goldfish named " + p.getName() + ", Age " + p.getAge();
        } else if (p instanceof Dog dog){
            return "A Fluffy Dog named " + p.getName() + "... likesFetch? " + dog.isLikesFetch() + ".";
        } else {
            return "Not a recognized pet in the pet describer";
        }
    }
}
