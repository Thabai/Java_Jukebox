package Jukebox;

import java.util.LinkedList;
import java.util.List;

public class Album{

        private List<Song> albumSongs;
        private int ID;
        private String Title;
        private String Artist;


    public Album(List<Song> albumSongs) {
        this(albumSongs, 1);

    }

    public Album(List<Song> albumSongs, int ID) {
        this(albumSongs, 1, "tester");
    }

    public Album(List<Song> albumSongs, int ID,  String Title) {
        this(albumSongs, 1, "tester", "Testing");
    }

        public Album (List<Song> albumSongs,int ID, String Title, String Artist){
            super();
            this.albumSongs = albumSongs;
            this.ID = ID;
            this.Title = Title;
            this.Artist = Artist;
        }



    public String getAlbum(){
        return "Now playing from the album " + this.Title + " by the artist " + this.Artist;
    }

    public void setAlbum(LinkedList<Song> albumSongs, String title, String artist) {
        this.albumSongs = albumSongs;
        this.Title = title;
        this.Artist = artist;
    }

    public String getTitle() {
        return this.Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getArtist() {
        return this.Artist;
    }

    public void setArtist(String artist) {
        this.Artist = artist;
    }

    public LinkedList<Song> addAlbumSong(String track, String artist) {
        albumSongs.add(new Song(track, artist));
        return null;
    }


}
