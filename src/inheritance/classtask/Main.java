package inheritance.classtask;

public class Main {
    public static void main(String[] args) {
        Song song = new Song("Jack",2,"comedy","Tarantino");
        song.display();
        
        Movie movie = new Movie("mick",3,"thriller",9);

        movie.display();

        Series series = new Series("mick",3,"thriller",9,5);
        series.display();

    }
}
