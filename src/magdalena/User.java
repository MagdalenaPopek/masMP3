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
    protected int userId;

    /**
     * Imie
     */
    protected String name;

    /**
     * Nazwisko
     */
    protected String surname;

    /**
     * Data urodzenia
     */
    protected Date birthDate;

    /**
     * Numer telefonu
     */
    protected String phoneNumber;

    //-----EMPLOYEE y EL CONCURSANTE
    private Vector<Contestant> contestants = new Vector<>();
    private static HashSet<Contestant> allCont = new HashSet<>();

    private Vector<Client> clients = new Vector<>();
    private static HashSet<Client> allClients = new HashSet<>();

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

    public void addClient(Client client) {
        if (!clients.contains(client) && !allClients.contains(client)) {
            clients.add(client);
            allClients.add(client);
            allObjects.add(client);
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
