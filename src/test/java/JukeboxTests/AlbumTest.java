package JukeboxTests;

import Jukebox.Album;
import Jukebox.Song;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlbumTest {

    @Test
    public void testGetTitle(){
            Album testSongs = new Album( {Song =new Song("Surfin", "Beach Boys"),Song = new Song("Surf", "Beach Boys")}, "Surfin USA" ,"Beach Boys");
            assertEquals("Surfin USA", testSongs.getTitle(),"No Title");
        }


        @Test
        public void testGetSongs(){
            Album testSongs = new Album(<"Surfin USA"; "Surfer">, "Surfin USA" ,"Beach Boys");
            assertEquals("", testSongs.getSongs(),"No Artist");
        }
    }


