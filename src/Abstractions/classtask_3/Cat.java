package Abstractions.classtask_3;

public class Cat extends Animal{
    public Cat (String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    public  void scratch() {
        System.out.println("Cat is scratching the sofa!");
    }
}
