package Abstractions.hometask_1;

public class Fish extends Pet {
    public Fish(String voice) {
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

}
