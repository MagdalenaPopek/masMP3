package magdalena;

import java.util.Date;

/**
 * Created by Magdalena on 2017-04-22.
 */
public class Trainer extends Employee{

    /**
     * Numer certyfikatu
     */
    private int certificateNumber;

    /**
     * Numer uprawnień
     */
    private int permissionNumber;

    /**
     * Klasa sportowa
     */
    private int NAZWIJTOJAKOS;

    /**
     * Bonus
     */
    private double bonus;

    public Trainer(User user, Date hireDate, double salary, int certificateNumber, int permissionNumber, int NAZWIJTOJAKOS) {
        super(user, hireDate, salary);
        this.certificateNumber = certificateNumber;
        this.permissionNumber = permissionNumber;
        this.NAZWIJTOJAKOS = NAZWIJTOJAKOS;
    }
}
