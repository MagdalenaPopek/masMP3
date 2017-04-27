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
        Employee.createEmployee(testUser, date, 1234);
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
    }
}
