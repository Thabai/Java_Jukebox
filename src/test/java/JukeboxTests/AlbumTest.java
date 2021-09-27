package JukeboxTests;

import Jukebox.Album;
import Jukebox.Song;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlbumTest {

    @Test
    public void testGetSetAlbum() {
        Album testSongs = new Album(new LinkedList<Song>(), 1,"Surfin USA", "Beach Boys");
        testSongs.setAlbum(new LinkedList<Song>(), 2, "Sorry for Party Rocking", "LMFAO");
        assertEquals("Now playing song number 2 from the album Sorry for Party Rocking by the artist LMFAO", testSongs.getAlbum(),"No album songs");
    }

    @Test
    public void testGetSetArtist(){

        Album testSongs = new Album( new LinkedList<Song>() , 1,"test", "test");
        testSongs.setArtist("Beach Boys");
        assertEquals("Beach Boys", testSongs.getArtist(),"No Artist set");
        }


    @Test
    public void testGetSetTitle(){

        Album testSongs = new Album( new LinkedList<Song>() ,1,"test", "test");
        testSongs.setTitle("Surfin USA");
        assertEquals("Surfin USA", testSongs.getTitle(),"No Title set");
    }

    @Test
    public void testGetSetSongNumber(){

        Album testSongs = new Album( new LinkedList<Song>() ,1,"test", "test");
        testSongs.setSongNumber(4);
        assertEquals(4, testSongs.getSongNumber(),"No Title set");
    }

    @Test
    public void testGetSetSongs(){
        Album testSongs = new Album(new LinkedList<Song>(), 1,"Surfin USA", "Beach Boys");
        testSongs.addAlbumSong("Party Rocking", "LMFAO");
        assertEquals("Song available Party Rocking", testSongs.songAvailable("Party Rocking"),"Song not found");
    }
    }


