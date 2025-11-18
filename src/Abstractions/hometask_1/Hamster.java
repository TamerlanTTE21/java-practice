package Abstractions.hometask_1;

public class Hamster extends Pet{
    public Hamster(String voice) {
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
    public void hideFood() {
        System.out.println("Вся еда — в щёчках!");
    }
}
