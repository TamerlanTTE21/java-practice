package Inheritance.hometask;

public class Animal {
    String name;

    public Animal(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }

    void makeSound() {
        System.out.println("Some generic animal sound");
    }

    void printInfo() {
        System.out.println("Animal name: " + getName());
        makeSound();

    }
}
