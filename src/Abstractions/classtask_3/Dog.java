package Abstractions.classtask_3;

public class Dog extends Animal{
    public Dog (String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
    public  void fetch() {
        System.out.println("Dog is fetching the ball!");
    }
}
