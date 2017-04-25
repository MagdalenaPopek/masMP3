package magdalena;

import java.util.Date;
import java.util.EnumSet;

/**
 * Created by Magdalena on 2017-04-22.
 */

//Osoba jest od razu klientem
public abstract class User {

    private static int counter;

    /**
     * Numer (id) użytkownika
     */
    private int userId;

    /**
     * Imie
     */
    private String name;

    /**
     * Nazwisko
     */
    private String surname;

    /**
     * Data urodzenia
     */
    private Date birthDate;

    /**
     * Numer telefonu
     */
    private String phoneNumber;

    //-----------EMPLOYEE-----------
    /**
     * Data zatrudnienia
     */
    private Date hireDate;

    /**
     * Pensja
     */
    private double salary;

    //-----------CONTESTANT-----------
    /**
     * Numer startowy
     */
    private int contestantNumber;

    //overlapping
    private EnumSet<UserType> userType = EnumSet.<UserType>of(UserType.User);

    //dynamic
    private EnumSet<EmployeeType> empType = EnumSet.<EmployeeType>of(EmployeeType.Employee);

    public User(String name, String surname, Date birthDate, String phoneNumber){
        this.userId = counter++;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Użtkownik o numerze " + userId +
                ", imię: " + name +
                ", nazwisko: " + surname;
    }


}
