package magdalena;

import java.util.*;

/**
 * Created by Magdalena on 2017-04-22.
 */

//Osoba jest od razu klientem
public class User {

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

    //-----EMPLOYEE y EL CONCURSANTE
    private Vector<Contestant> contestants = new Vector<>();
    private static HashSet<Contestant> allCont = new HashSet<>();

    private Vector<Employee> emps = new Vector<>();
    private static HashSet<Employee> allEmp = new HashSet<>();

    private static HashSet<User> allUsers = new HashSet<>();
    List<Object> allObjects = new ArrayList<Object>();

    public User(String name, String surname, Date birthDate, String phoneNumber) {
        this.userId = counter++;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public void addContestant(Contestant cont) {
        if (!contestants.contains(cont) && !allCont.contains(cont)) {
            contestants.add(cont);
            allCont.add(cont);
            allObjects.add(cont);
        }
    }

    public void addEmployee(Employee emp) {
        if (!emps.contains(emp) && !allEmp.contains(emp)) {
            emps.add(emp);
            allEmp.add(emp);
            allObjects.add(emp);
        }
    }


/*    public static void removeUser( User user){
        if(allUsers.contains(user)){
            for (Employee emp : user.getAllEmps()) {
                if(!stall.getHorsesInStall().isEmpty()) {
                    List<Horse> myNew = new ArrayList<>(stall.getHorsesInStall());
                    for(Horse h : myNew){
                        h.removeStall();
                    }
                    stall.getHorsesInStall().clear();
                }
                stall.removeStable(stable);
            }
            allStalls.clear();
            allStables.remove(stable);

        }
    }*/

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

    public void showAllPeople() {
        for(Object o : allObjects){
            System.out.println(o);
        }
    }
}
