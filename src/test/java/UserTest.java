import com.sun.source.tree.UsesTree;
import org.example.User;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UserTest {
    private User user;
    private static final String theBestMusicInTheWorld = "LO-fi";

    @AfterAll
    static void afterAll() {
        System.out.println("Test has benn successfully passed, now you can calm down listening to " + theBestMusicInTheWorld + " music");
    }

    @Test
    void ifUserObjectIsExist() {
        user = new User("couldliegor@gmail.com", "qwerty2200");
        Assertions.assertTrue(user.getUserList().get(0) == user);
    }

    @Test
    void ifUserObjectIsEmpty() {
        user = new User();
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> Assertions.assertEquals(user.getUserList().get(0), user));
    }

    @Test
    void shouldThrowRuntimeExceptionIfEmailInObjectIsIncorrect() {
        Assertions.assertThrows(RuntimeException.class, () -> user = new User("couldliegorgmailcom", "qwerty2200"));
        Assertions.assertThrows(RuntimeException.class, () -> user = new User("couldliegorgmail.com", "qwerty2200"));
        Assertions.assertThrows(RuntimeException.class, () -> user = new User("couldliegor@gmailcom", "qwerty2200"));
    }

    @Test
    void emailAndLLoginShouldNotBeEqualChecking() {
        Assertions.assertThrows(RuntimeException.class, () -> user = new User("couldliegor@gmail.com", "couldliegor@gmail.com"));
    }
}

//    @Test
//    void
