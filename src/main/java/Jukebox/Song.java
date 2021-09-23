package Jukebox;

public class Song extends Album {
    private String Track;
    private String Artist;

    public Song (String Track, String Artist){
        this.Track = Track;
        this.Artist = Artist;
    }

    public String toString() {
        return "meow";
    }

    public String getTrack() {
        return Track;
    }

    public void setTrack(String track) {
        this.Track = track;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        this.Artist = artist;
    }
}
