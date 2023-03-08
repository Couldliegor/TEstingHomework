import com.sun.source.tree.UsesTree;
import org.example.User;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {
    private User user;
    private static final String theBestMusicInTheWorld = "LO-fi";
    private static final String DEFAULT_EMAIL = "couldliegor@gmail.com";
    private static final String DEFAULT_LOGIN = "qwerty2200";
    @AfterAll
    static void afterAll() {
        System.out.println("Test has benn successfully passed, now you can calm down listening to " + theBestMusicInTheWorld + " music");
    }

    @Test
    void ifUserObjectIsExist() {
        user = new User("couldliegor@gmail.com", "qwerty2200");
        Assertions.assertTrue(user.getEmail().equals(DEFAULT_EMAIL) && user.getLogin().equals(DEFAULT_LOGIN));
    }

    @Test
    void ifUserObjectIsEmpty() {
        user = new User();
        Assertions.assertNull(user.getLogin());
        Assertions.assertNull(user.getEmail());
    }

    @Test //Исправить и сделать проверку прямо в конструкторе
    void emailShouldBeCorrect() {
        Assertions.assertThrows(RuntimeException.class,()-> user = new User("couldliegorgmailcom", "qwerty2200"));
    }

    @Test //Сделать проверку прямо в конструкторе
    void emailAndLLoginShouldNotBeEqualChecking() {
        user = new User("couldliegor@gmail.com", "qwerty2200");
        Assertions.assertThrows(RuntimeException.class,()-> user = new User("couldliegor@gmail.com", "couldliegor@gmail.com"));
    }
}