package magdalena;

import java.util.Date;

/**
 * Created by Magdalena on 2017-04-26.
 */
public class Eventing extends Competition {
    public Eventing(String compName, CompetitionLevel competitionLevel, Date date, double price) {
        super(compName, competitionLevel, date, price);
    }

    public Eventing(String compName, CompetitionLevel competitionLevel, Date date, int maxContestantNumber) {
        super(compName, competitionLevel, date, maxContestantNumber);
    }
}
