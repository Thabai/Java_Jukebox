package JukeboxTests;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class SongTest {

    @Test
    @DisplayName("This is a test to check song title");
    public void testGetTitle(){
        Song testTitle = new Song();
        testTitle.setTitle("Simon");
        assertEquals(testTitle.getTitle(),"Simon","This is a rubbish test");
    }
    @Test
    @DisplayName("This is a test to check song artist");
    public void testGetArtist(){
        Song testArtist = new Song();
        testArtist.setArtist("Simon");
        assertEquals(testArtist.getArtist(),"Simon","This is a rubbish test");
    }
}
