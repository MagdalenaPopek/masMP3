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
         * Employee > Groom, Instructor,, Trainer
         */

        /**
         * OVERLAPPING
         * User > Contestant, Owner, Employee
         */

        /**
         * WIELODZIEDZICZENIE
         * User > VipUser, C, O, E
         */

        /**
         * WIELOASPEKTOWE
         * Contestant + Owner = OwnerContestant
         */

        /**
         * DYNAMIC
         * Groom, Instructor,
         */
    }
}
