package magdalena;

import java.util.Date;

/**
 * Created by Magdalena on 2017-04-26.
 */
public abstract class Competition {

    /**
     * Nazwa
     */
    private String compName;

    /**
     * Klasa
     */
    private CompetitionLevel competitionLevel;

    /**
     * Data
     */
    private Date date;

    public Competition(String compName, CompetitionLevel competitionLevel, Date date){
        this.compName = compName;
        this.competitionLevel = competitionLevel;
        this.date = date;
    }


}
