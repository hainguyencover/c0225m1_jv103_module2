package b1.animal;

import b1.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Chicken: Cluck!";
    }
    @Override
    public String howToEat() {
        return "Chicken: could be fried";
    }
}
