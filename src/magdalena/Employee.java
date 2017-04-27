package magdalena;

import java.util.Date;


/**
 * Created by Magdalena on 2017-04-22.
 */

public class Employee extends User {


    /**
     * Data zatrudnienia
     */
    private Date hireDate;

    /**
     * Pensja
     */

    private double salary;

    /**
     * User
     */
    private User user;


    private Employee(User user, Date hireDate, double salary) {
        super(user.getName(), user.getSurname(), user.getBirthDate(), user.getPhoneNumber());
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public static Employee createEmployee(User user, Date hireDate, double salary) throws Exception {
        if (user == null) {
            throw new Exception("ERROR");
        }
        Employee e = new Employee(user, hireDate, salary);
        user.addEmployee(e);

        return e;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public double getSalary() {
        return salary;
    }
}