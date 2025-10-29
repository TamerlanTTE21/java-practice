package inheritance;

public class Movie extends Media {
    int rating;
    public Movie(String newName, int newDuration, String newGenre, int newRating) {
        super(newName, newDuration, newGenre);
        rating = newRating;
    }
    @Override
    void display() {
       super.display();
        System.out.println("Рейтинг " + rating);
    }
}
