package Abstractions.classtask_3;

public class Cow extends Animal{
    public Cow (String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Moo!");
    }
}
