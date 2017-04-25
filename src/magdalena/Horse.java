package magdalena;

import java.util.Date;
import java.util.HashSet;

public class Horse {

    private static HashSet<Horse> allHorses = new HashSet<Horse>();

    /**
     * Imię
     */
    private String name;

    /**
     * Data urodzenia
     */
    private Date birthDate;

    /**
     * Numer paszportu
     */
    private String passportNumber;

    /**
     * Płeć
     */
    private String gender;

    /**
     * Właściciel
     */
    private Owner owner;

    public Horse(String name, Date birthDate, String passportNumber, String gender) throws Exception {
        this.name = name;
        this.birthDate = birthDate;
        this.passportNumber = passportNumber;
        this.gender = gender;
        if(!isPassportDifferent(passportNumber, allHorses)) {
            throw new Exception("Koń o podanym numerze paszportu już istnieje");
        }
    }

    private boolean isPassportDifferent(String passportNumber, HashSet<Horse> allHorses){
        for (Horse h: allHorses) {
            if(h.getPassportNumber().equals(passportNumber)){
                return false;
            }
        }
        return true;
    }

    public void setOwner(Owner owner) throws Exception {
        if(this.owner != null){
            throw new Exception("Ten koń ma już właściciela");
        }
        this.owner = owner;
        owner.addHorse(this);
    }

    public void removeOwner(){
        this.owner = null;
    }

    public Owner getOwner() {
        return owner;
    }

    public void addHorse(Horse horse) throws Exception {
            if(allHorses.contains(horse)){
                throw new Exception("Nie można dodać konia do listy, już na niej widnieje");
            }
            allHorses.add(horse);
        }

    public String getName() {
        return name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }



    @Override
    public String toString() {
        return name + ", " + birthDate +
                ", " + passportNumber +
                ", " + gender;
    }

}