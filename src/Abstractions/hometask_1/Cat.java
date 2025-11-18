package Abstractions.hometask_1;

public class Cat extends Pet {
    public Cat(String voice) {
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
    public void catchMouse() {
        System.out.println("Поймала мышку!Поймала мышку!");
    }
    @Override
    public void giveVoice() {
        System.out.println("Мяу");
    }
}
