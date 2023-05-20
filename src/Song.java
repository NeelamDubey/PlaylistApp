public class Song {
    private String genre;
    private String title;
    private int duration;
    private String artist;
    public Song(String title,String artist,int duration,String genre)
    {
        this.artist=artist;
        this.title=title;
        this.duration=duration;
        this.genre=genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
