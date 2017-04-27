package magdalena;

import java.util.*;

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

    //--------OGÓLNOPOLSKIE--------
    private double price;

    //--------REGIONALNE--------
    private int maxContestantNumber;

    //Rodzaj zawodów
    private EnumSet<CompetitionType> compType = EnumSet.<CompetitionType>of(CompetitionType.Competition);

    public Competition(String compName, CompetitionLevel competitionLevel, Date date, double price) {
        this.compName = compName;
        this.competitionLevel = competitionLevel;
        this.date = date;
        this.price = price;
    }

    public Competition(String compName, CompetitionLevel competitionLevel, Date date, int maxContestantNumber) {
        this.compName = compName;
        this.competitionLevel = competitionLevel;
        this.date = date;
        this.maxContestantNumber = maxContestantNumber;
    }


    @Override
    public String toString() {
        return "Competition{" +
                "compName='" + compName + '\'' +
                ", competitionLevel=" + competitionLevel +
                ", date=" + date +
                ", price=" + price +
                '}';
    }

    //@Override
    public String toStringSmall() {
        return "Competition{" +
                "compName='" + compName + '\'' +
                ", competitionLevel=" + competitionLevel +
                ", date=" + date +
                ", maxContestantNumber=" + maxContestantNumber +
                '}';
    }
}
