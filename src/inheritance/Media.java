package inheritance;

public class Media {
    String name;
    int duration;
    String genre;

    public Media(String newName, int newDuration, String newGenre) {
        name = newName;
        duration = newDuration;
        genre = newGenre;
    }

    void display() {
        System.out.println("Название "+ name);
        System.out.println("Продолжительность "+ duration);
        System.out.println("Жанр "+ genre);
    }
}
