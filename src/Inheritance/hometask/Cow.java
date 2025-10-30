package Inheritance.hometask;

public class Cow extends Animal{
    public Cow (String name) {
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println("Moo!");
    }

}
