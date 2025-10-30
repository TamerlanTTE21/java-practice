package Inheritance.hometask;


public class Cat extends Animal{
    public Cat (String name) {
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
    void scratch() {
        System.out.println("Cat is scratching the sofa!");
    }
}
