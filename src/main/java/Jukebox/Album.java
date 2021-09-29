package Jukebox;

import java.util.LinkedList;
import java.util.List;

public class Album{

        private List<Song> albumSongs;
        private String albumTitle;
        private String albumArtist;

    public Album (List<Song> albumSongs, String albumTitle, String albumArtist){
            super();
            this.albumSongs = albumSongs;
            this.albumTitle = albumTitle;
            this.albumArtist = albumArtist;
        }

    public String getAlbum(){
        return "Now playing from the album " + this.albumTitle + " by the artist " + this.albumArtist;
    }

    public void setAlbum(List<Song> albumSongs, String albumTitle, String albumArtist) {
        this.albumSongs = albumSongs;
        this.albumTitle = albumTitle;
        this.albumArtist = albumArtist;
    }

    public String getAlbumTitle() {
        return this.albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public String getAlbumArtist() {
        return this.albumArtist;
    }

    public void setAlbumArtist(String albumArtist) {
        this.albumArtist = albumArtist;
    }

    public void addAlbumSong(String track, String artist) {
        albumSongs.add(new Song(track, artist));
    }

    public List<Song> getAlbumSongs() {
        return albumSongs;
    }

    public String songAvailable(String Track) {

        for (Song checkedSong : this.getAlbumSongs()) {
            if (checkedSong.getTrack().equals(Track)) {
                return "Song available " + checkedSong.getTrack();
            }
        }
        return "Song not available";
    }
}
