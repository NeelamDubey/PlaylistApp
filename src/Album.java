import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Album {
    private String title;
    private String artist;
    private List<Song> songs;
    public Album(String title,String artist)
    {
        this.artist=artist;
        this.title=title;
        this.songs=new ArrayList<>();
    }
    public Album(String title,String artist,List<Song> songs)
    {
        this.artist=artist;
        this.title=title;
        this.songs=songs;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Song> getSongs() {
        return songs;
    }
    private boolean findSong(Song songToFind)
    {
        for(Song song:songs)
        {
            if(song.getTitle().equals(songToFind) && song.getArtist().equals(songToFind.getArtist()))
            {
                return true;
            }
        }
        return false;
    }
    public boolean findSong(String songName)
    {
        for(Song song:songs)
        {
            if(song.getTitle().equals(songName))
            {
                return true;
            }
        }
        return false;
    }
    public String addSong(Song song)
    {
        if(this.findSong(song))
        {
            return "Song already added";
        }
        songs.add(song);
        return "Song added";
    }

    public Optional<Song> searchSong(String songName) {
        for(Song song:songs)
        {
            if(song.getTitle().equals(songName))
            {
                return Optional.of(song);
            }
        }
        return Optional.empty();
    }
}
