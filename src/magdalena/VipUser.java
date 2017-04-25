package magdalena;

/**
 * Created by Magdalena on 2017-04-22.
 */
public class VipUser extends User{

    /**
     * Zniżka na jazdy z racji bycia stałym klientem
     */
    private int discount;

    /**
     * Punkty VIP na podstawie, których zwiększana jest zniżka
     */
    private int vipPoints;

    public VipUser(User user){
        super(user.getName(), user.getSurname(), user.getBirthDate(), user.getPhoneNumber());
    }

}
