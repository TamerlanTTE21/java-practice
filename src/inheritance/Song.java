package inheritance;

public class Song extends Media {
    String performer;
    public Song(String newName, int newDuration, String newGenre, String newPerformer) {
        super(newName, newDuration, newGenre);
        performer = newPerformer;
    }

    @Override
    void display() {
       super.display();

    }
}
