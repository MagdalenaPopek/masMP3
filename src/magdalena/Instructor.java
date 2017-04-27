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
     * Premia od ilości jazd
     */
    private double lessonBonus;

    public Instructor(User user, Date hireDate, double salary, int odznakaNumber, int permissionNumber) {
        super(user, hireDate, salary);
        this.odznakaNumber = odznakaNumber;
        this.permissionNumber = permissionNumber;
    }

    public double getLessonBonus() {
        return lessonBonus;
    }

    public void setLessonBonus(double lessonBonus) {
        this.lessonBonus = lessonBonus;
    }

   /* public double getIncome(){
        return getSalary() + getSalary()*getBonus()/100 + this.lessonBonus;
    }*/
}
