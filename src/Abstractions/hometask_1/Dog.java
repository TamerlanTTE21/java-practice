package Abstractions.hometask_1;

public class Dog extends Pet {
    public Dog(String voice) {
        super(voice);
    }

    @Override
    public void sleep() {
        System.out.println("Сплю");
    }
    @Override
    public void play() {
        System.out.println("Играю");
    }
    public void bringStick() {
        System.out.println("Принёс палочку, как хороший мальчик!");
    }
}
