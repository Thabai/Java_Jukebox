package Jukebox;

public class Song extends Playlist {
    private String Track;
    private String Artist;

    public Song() {
        this("test");
    }
    public Song(String track) {
        this("test", "tester");
    }
    
    public Song (String Track, String Artist){
        super();
        this.Track = Track;
        this.Artist = Artist;
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

//    public String getSongPlaying(){
//        return "Now playing " + this.Track + this.Artist;
//    }
}
