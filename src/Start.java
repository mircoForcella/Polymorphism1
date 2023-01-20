import it.develhope.entities.Animal;

public class Start {
    public static void main(String[] args) {

        Animal animal = new Animal("Gnar");

        //testing the Polymorphism methods
        animal.animalSound();
        animal.animalSound("high");
        animal.animalSound("low");
        animal.animalSound("dwadwfgw");
    }
}
