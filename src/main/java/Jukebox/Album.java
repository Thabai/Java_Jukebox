package Jukebox;

import java.util.LinkedList;
import java.util.List;

public class Album extends Playlist{
        private List<Song> albumSongs = new LinkedList<>();
        private String Title;
        private String Artist;

        public Album (List<Song> albumSongs, String Title, String Artist){
            this.albumSongs = albumSongs;
            this.Title = Title;
            this.Artist = Artist;
        }

    public String getAlbum(){
        return "Now playing from the album " + this.Title + " by the artist " + this.Artist;
    }

    public LinkedList<Song> addAlbumSong(String track, String artist) {
        albumSongs.add(new Song(track, artist));
        return null;
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

}
