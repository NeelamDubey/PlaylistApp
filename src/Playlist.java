import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

public class Playlist {
    private String title;
    private List<Song> songs;
    private ListIterator<Song> itr;
    private boolean wasNext=true;


    public Playlist(String title) {
        this.title = title;
        this.songs = new ArrayList<>();
        itr= songs.listIterator();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String addSongFromAlbum(Album album, String songName)
    {
        Optional<Song> songOpt=album.searchSong(songName);
        if(songOpt.isEmpty())
        {
            return "Song not found in album";
        }
        Song songInAlbum=songOpt.get();
        this.songs.add(songInAlbum);
        itr= songs.listIterator();
        return "Song added successfully";
    }

    public String playNext()
    {
        if(wasNext)
        {

        }
        if(!wasNext)
        {
            wasNext=true;
            itr.next();
        }
        if(itr.hasNext())
        {
            wasNext=true;
            Song song=itr.next();
            return "Next song is"+song.getName();
        }
        return "You have reached end of playlist";
    }

    public String playPrevious()
    {
        if(!wasNext)
        {

        }
        if(wasNext)
        {
            wasNext=false;
            itr.previous();
        }
        if(itr.hasPrevious())
        {
            wasNext=true;
            Song song=itr.previous();
            return "Previous song is"+song.getName();
        }
        return "You have reached top of playlist";
    }

    public String playCurrentSong()
    {
        if(wasNext)
        {
            wasNext=false;
            return "Current song is"+itr.previous();
        }
        wasNext=true;
        return "Current song is"+itr.next();
    }
    public String toString() {
        return "PlayList{" +
                "title='" + title + '\'' +
                ", songs=" + songs +
                ", itr=" + itr +
                ", wasNext=" + wasNext +
                '}';
    }
}
