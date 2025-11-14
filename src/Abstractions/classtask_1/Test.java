package Abstractions.classtask_1;

public class Test {
    public static void main(String[] args) {
        Frog frog = new Frog("Зеленый");
        frog.eat();
        frog.move();
        System.out.println("Цвет: " + frog.getColor());

        Toad toad = new Toad("Коричневый");
        toad.eat();
        toad.move();
        System.out.println("Цвет: " + toad.getColor());
    }
}

abstract class Amphibian {
    protected String color;

    protected Amphibian(String color) {
        this.color = color;
    }

    public abstract void move();

    public String getColor() {
        return color;
    }

    public void eat() {
        System.out.println("Кушаю насекомых");
    }
}

class Frog extends Amphibian {
    public Frog(String color) {
        super(color);
    }

    @Override
    public void move() {
        System.out.println("Прыгаю");
    }
}

class Toad extends Amphibian {
    public Toad(String color) {
        super(color);
    }

    @Override
    public void move() {
        System.out.println("Хожу");
    }
}
