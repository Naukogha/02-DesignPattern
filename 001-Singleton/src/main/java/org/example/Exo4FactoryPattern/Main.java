package org.example.Exo4FactoryPattern;

public class Main {
    public static void main(String[] args) {
        AnimalFactory chatFactory = new CatFactory();
        Animal miaous = chatFactory.createAnimal();
        miaous.makeSound();

        AnimalFactory chienFactory = new DogFactory();
        Animal arcanin = chienFactory.createAnimal();
        arcanin.makeSound();
    }
}
