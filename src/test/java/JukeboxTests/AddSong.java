//package JukeboxTests;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class AddSong {
//    static String checkSong (String songAvailable) {
//        return "Party Time".equals(songAvailable) ? "Yes" : "No";
//    }
//
//    private String songAvailable;
//    private String actualAnswer;
//
//    @Given("song is available")
//    public void the_song_is_available() {
//        songAvailable = "Party Time";
//        checkSong(songAvailable);
//    }
//
//    @Given("song is not available")
//    public void the_song_is_not_available() {
//        songAvailable = "Hip Hop Party";
//        checkSong(songAvailable);
//    }
//
//    @When("I try to add the song to the playlist")
//    public void the_person_tries_to_add_the_song_to_the_playlist() {
//        actualAnswer = AddSongToPlaylist.playSong(songAvailable);
//    }
//
//    @Then("The song should be added to the playlist")
//    public void song_should_show_in_the_playlist(String expectedAnswer) {
//        assertEquals(expectedAnswer, actualAnswer);
//    }
//
//    @Then("The person should be told the song is not available")
//    public void the_person_should_be_told_the_song_is_not_available() {
//        if (checkSong(songAvailable = "No"));
//        return "Song not available";
//    }
//
//}
