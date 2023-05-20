public class Main {
    public static void main(String[] args) {
        Album album1=new Album("Party Songs","Badshah");

        album1.addSong(new Song("Chull","Badshah",8));
        album1.addSong(new Song("Party Hard","Badshah",9));
        album1.addSong(new Song("Desi Kalakar","Badshah",8));
        album1.addSong(new Song("Nagin Dance","Badshah",12));
        album1.addSong(new Song("DJ Wale Babu","Badshah",30));

        Album album2= new Album("Rap Song","Honey Shing");
        album2.addSong(new Song("Chal Mere Ghar","Honey Shing",5));
        album2.addSong(new Song("Browm Munde","Honey Shing",15));
        album2.addSong(new Song("Blue Eyes","Honey Shing",7));
        album2.addSong(new Song("Char Bottel Vodka","Honey Shing",25));
        album2.addSong(new Song("Love Dose","Honey Shing",20));

        Playlist myPlaylist =new Playlist("Mix Songs");
        myPlaylist.addSongFromAlbum(album1,"Chull");
        myPlaylist.addSongFromAlbum(album1,"Nagin Dance");
        myPlaylist.addSongFromAlbum(album1,"Party Hard");

        myPlaylist.addSongFromAlbum(album2,"Chal Mere Ghar");
        myPlaylist.addSongFromAlbum(album2,"Blue Eyes");
        myPlaylist.addSongFromAlbum(album2,"Love Dose");

        System.out.println(myPlaylist.playCurrentSong());
        System.out.println(myPlaylist.playNext());
        System.out.println(myPlaylist.playNext());
        System.out.println(myPlaylist.playNext());
        System.out.println(myPlaylist.playPrevious());
        System.out.println(myPlaylist.playPrevious());
        System.out.println(myPlaylist.playCurrentSong());
    }
}