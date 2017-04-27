package magdalena;

/**
 * Created by Magdalena on 2017-04-22.
 */

public class Contestant extends User {

    private static int counter;

    /**
     * Numer zawodnika
     */

    private int contestantNumber;

    /**
     * User
     */
    private User user;

    private Contestant(User user) {
        super(user.getName(), user.getSurname(), user.getBirthDate(), user.getPhoneNumber());
        this.contestantNumber = counter++;
    }

    public static Contestant createContestant(User user) throws Exception {
        if (user != null) {
            throw new Exception("ERROR");
        }
        Contestant c = new Contestant(user);
        user.addContestant(c);

        return c;
    }

    public int getContestantNumber() {
        return contestantNumber;
    }


}
