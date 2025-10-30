package Inheritance.hometask;

public class Dog extends Animal{
public Dog (String name) {
    super(name);
}
@Override
    void makeSound() {
        System.out.println("Woof!");
    }

    void fetch() {
        System.out.println("Dog is fetching the ball!");
    }

}
