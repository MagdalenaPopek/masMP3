package magdalena;

import java.util.Date;

/**
 * Created by Magdalena on 2017-04-23.
 */
public class Instructor extends Employee{

    /**
     * Numer odznaki
     */
    private int odznakaNumber;

    /**
     * Numer uprawnień
     */
    private int permissionNumber;

    /**
     * Bonus
     */
    private double bonus;

    public Instructor(User user, Date hireDate, double salary, int odznakaNumber, int permissionNumber) {
        super(user, hireDate, salary);
        this.odznakaNumber = odznakaNumber;
        this.permissionNumber = permissionNumber;
    }
}
