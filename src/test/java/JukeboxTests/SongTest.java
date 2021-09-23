package JukeboxTests;

import Jukebox.Song;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongTest {

    @Test
    public void testGetTrack(){
        Song testSong = new Song("Surfin USA", "Beach Boys");
        assertEquals("Surfin USA", testSong.getTrack(),"No Title");
    }


    @Test
    public void testGetArtist(){
        Song testSong = new Song("Surfin USA", "Beach Boys");
        assertEquals("Beach Boys", testSong.getArtist(),"No Artist");
    }
}
