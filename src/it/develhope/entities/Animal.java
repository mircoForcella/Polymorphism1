package it.develhope.entities;

public class Animal {
    private String animalName;

    public Animal(String animalName){
        this.animalName = animalName;
    }


    //First method of animalSound (Polymorphism)
    public void animalSound() {
        System.out.println("Roarr!");
    }

    //Second method of animalSound (Polymorphism)
    public void animalSound(String intensity){

        if (intensity.toLowerCase() == "high"){
            System.out.println("Roarrrrrrrr!");
        } else if (intensity.toLowerCase() == "low") {
            System.out.println("Roar");
        }else{
            System.out.println("Cannot reproduce it properly");
        }
    }
}
