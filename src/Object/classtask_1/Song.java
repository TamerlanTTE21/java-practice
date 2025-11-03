package Object.classtask_1;

import java.util.Objects;

public class Song {
    public String title;
    public String artist;
    public String songwriter;

    public Song(String title, String artist, String songwriter) {
        this.title = title;
        this.artist = artist;
        this.songwriter = songwriter;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Song song =(Song) obj;
        return Objects.equals(title, song.title) && Objects.equals(artist, song.artist) && Objects.equals(songwriter, song.songwriter);
    }
}
