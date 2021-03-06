package magdalena;

import java.util.Date;

/**
 * Created by Magdalena on 2017-04-22.
 */
public abstract class Employee extends User{

    /**
     * Data zatrudnienia
     */
    private Date hireDate;

    /**
     * Data zwolnienia
     */
    private Date fireDate;

    /**
     * Pensja
     */
    private double salary;


    public Employee(User user, Date hireDate, double salary) {
        super(user.getName(), user.getSurname(), user.getBirthDate(), user.getPhoneNumber());
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public double getIncome(){
        return salary ;
    }
}
