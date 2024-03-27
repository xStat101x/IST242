package model;

import java.util.ArrayList;

public class DogBasket {

    private ArrayList<Dog> basket;

    public DogBasket() {
        this.basket = new ArrayList<>();
    }

    public void addDogToBasket(Dog d) {
        basket.add(d);
    }
    public int numOfDogsInBasket() {
        return basket.size();
    }


}
