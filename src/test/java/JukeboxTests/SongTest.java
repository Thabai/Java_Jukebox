package JukeboxTests;

import Jukebox.Song;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongTest {

    @Test
    public void testGetSetTrack(){
        Song testSong = new Song("Testy", "Testy");
        testSong.setTrack("Surfin USA");
        assertEquals("Surfin USA", testSong.getTrack(),"No Title");
    }


    @Test
    public void testGetSetArtist(){
        Song testSong = new Song("Testy", "Testy");
        testSong.setArtist("Beach Boys");
        assertEquals("Beach Boys", testSong.getArtist(),"No Artist");
    }
}
