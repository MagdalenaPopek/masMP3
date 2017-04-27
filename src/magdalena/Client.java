package magdalena;

import java.util.Date;
import java.util.HashSet;

/**
 * Created by Magdalena on 2017-04-27.
 */
public class Client extends User{

    /**
     * Zniżka
     */
    private int discount;

    /**
     * Wzrost
     */
    private int height;

    /**
     * Poziom zaawansowania
     */
    private LevelType level;

    /**
     * User
     */
    private User user;

    private static HashSet<User> allUsers = new HashSet<>();


    private Client(User user, int height, LevelType level) {
        super(user.getName(), user.getSurname(), user.getBirthDate(), user.getPhoneNumber());
        this.height = height;
        this.level = level;
    }

    public static Client createClient(User user, int height, LevelType level) throws Exception {
        if (user == null || allUsers.contains(user)) {
            throw new Exception("ERROR");
        }

        Client c = new Client(user, height, level);
        user.addClient(c);
        allUsers.add(user);

        return c;
    }
}
