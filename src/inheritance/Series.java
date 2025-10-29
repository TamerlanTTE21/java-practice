package inheritance;

public class Series extends Movie {
    int episodeCount;
    public Series(String newName, int newDuration, String newGenre, int newRating, int newEpisodeCount) {
        super(newName, newDuration, newGenre, newRating);
        episodeCount = newEpisodeCount;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Количество серий " + episodeCount);
    }
}
