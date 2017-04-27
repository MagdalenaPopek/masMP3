package magdalena;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {

        //Tu tworzę datę, bo potem za dużo zabawy z dodawaniem nowych dat urodzenia etc
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = sdf.parse("2007-01-01");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        /**
         * KLASA ABSTRAKCYJNA I POLIMORFIZM METOD
         */


        /**
         * OVERLAPPING
         */

        User testUser = new User("Anna", "K", date, "333");
        Client.createClient(testUser, 173, LevelType.advanced);
        Contestant.createContestant(testUser);
        testUser.showAllPeople();

        /**
         * WIELODZIEDZICZENIE
         */

        /**
         * WIELOASPEKTOWE
         */

        /**
         * DYNAMIC
         */

        Employee groom = new Groom(testUser, date, 12334);
        groom = new Instructor(groom, "1222", "12226");
    }
}
