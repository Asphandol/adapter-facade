import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.task1.twitter.TwitterCountry;
import ua.edu.ucu.apps.task1.twitter.TwitterUser;
import ua.edu.ucu.apps.task1.user.MyTwitterUser;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class MyTwitterUserTest {

    @Test
    public void testGetEmail() {
        TwitterUser twitterUser = new TwitterUser("test@example.com", TwitterCountry.USA, LocalDate.of(2023, 10, 1));
        MyTwitterUser myTwitterUser = new MyTwitterUser(twitterUser);
        assertEquals("test@example.com", myTwitterUser.getEmail());
    }

    @Test
    public void testGetCountry() {
        TwitterUser twitterUser = new TwitterUser("test@example.com", TwitterCountry.USA, LocalDate.of(2023, 10, 1));
        MyTwitterUser myTwitterUser = new MyTwitterUser(twitterUser);
        assertEquals("USA", myTwitterUser.getCountry());
    }

    @Test
    public void testGetActiveTime() {
        TwitterUser twitterUser = new TwitterUser("test@example.com", TwitterCountry.USA, LocalDate.of(2023, 10, 1));
        MyTwitterUser myTwitterUser = new MyTwitterUser(twitterUser);
        assertEquals(LocalDate.of(2023, 10, 1), myTwitterUser.getActiveTime());
    }
}