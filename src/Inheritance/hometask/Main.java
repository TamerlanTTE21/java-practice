package Inheritance.hometask;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        System.out.println("Animal name: " + dog.getName());
        dog.makeSound();
        dog.fetch();

        Cat cat = new Cat("Whiskers");
        System.out.println("Animal name: " + cat.getName());
        cat.makeSound();
        cat.scratch();

        Cow cow = new Cow("Bessie");
        System.out.println("Animal name: " + cow.getName());
        cow.makeSound();
    }
}
