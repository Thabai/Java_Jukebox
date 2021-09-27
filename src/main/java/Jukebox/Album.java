package Jukebox;

import java.util.LinkedList;
import java.util.List;

public class Album{

        private List<Song> albumSongs;
        private int songNumber;
        private String Title;
        private String Artist;


    public Album(List<Song> albumSongs) {
        this(albumSongs, 1);

    }

    public Album(List<Song> albumSongs, int songNumber) {
        this(albumSongs, 1, "tester");
    }

    public Album(List<Song> albumSongs, int songNumber, String Title) {
        this(albumSongs, 1, "tester", "Testing");
    }

        public Album (List<Song> albumSongs, int songNumber, String Title, String Artist){
            super();
            this.albumSongs = albumSongs;
            this.songNumber = songNumber;
            this.Title = Title;
            this.Artist = Artist;
        }


    public String getAlbum(){
        return "Now playing song number " + this.songNumber +  " from the album " + this.Title + " by the artist " + this.Artist;
    }

    public void setAlbum(LinkedList<Song> albumSongs, int songNumber, String title, String artist) {
        this.albumSongs = albumSongs;
        this.songNumber = songNumber;
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

    public int getSongNumber() {
        return this.songNumber;
    }

    public void setSongNumber(int songNumber) {
        this.songNumber = songNumber;
    }

    public LinkedList<Song> addAlbumSong(String track, String artist) {
        albumSongs.add(new Song(track, artist));
        return null;
    }


}
