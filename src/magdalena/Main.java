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
        Employee emp = new Groom("A", "B", date, "12222", date, 1000);
        Employee emp2 = new Instructor("D", "B", date, "22223445", date, 1000, "22222", "33333");
        System.out.println(emp.getIncome());
        System.out.println(emp2.getIncome());

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
        Competition cross = new CrossCountry("Memo", CompetitionLevel.C, date, 123.0, 7, 2);
        System.out.println(cross);
        cross.setPrize(20);
        System.out.println(cross.getPrize());
        /**
         * WIELOASPEKTOWE
         */
        cross.toString();
        System.out.println(cross.getCompetitionType());

        /**
         * DYNAMIC
         */

        User us = new User("A", "K", date, "000");
        Employee groom = new Groom(us, date, 12334);
        System.out.println(groom);
        groom = new Instructor(groom, "1222", "12226");
        System.out.println(groom);
    }
}
