package Abstractions.hometask_1;

public class Main {
    public class Practice {
        public static void main(String[] args) {
            Cat cat = new Cat("Мяу");
            cat.catchMouse();
            cat.giveVoice();

            Dog dog = new Dog("Гав");
            dog.bringStick();
            dog.play();

            Hamster hamster = new Hamster("мхм");
            hamster.hideFood();
            hamster.sleep();

            Fish fish = new Fish("буль");
            fish.sleep();

            Spider spider = new Spider("__");
            System.out.println("У паука " + spider.getPawsCount() + "лапок.");
        }

    }
}
