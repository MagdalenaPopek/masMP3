package magdalena;

import java.util.Date;
import java.util.HashSet;

/**
 * Created by Magdalena on 2017-04-22.
 */
public class Competition{

    /**
     * Nazwa zawodów
     */
    private String name;

    /**
     * Numer zawodów
     */
    private String competitionNumber;

    /**
     * Data zawodów
     */
    private Date date;

    public Competition(Date date, String name, String competitionNumber) {
        this.date = date;
        this.name = name;
        this.competitionNumber = competitionNumber;
    }

    public String getName() {
        return name;
    }

    public String getCompetitionNumber() {
        return competitionNumber;
    }
}
