package christmasPastryShop.entities.delicacies.interfaces;

public class Gingerbread extends BaseDelicacy{

    private static final double INITIAL_GINGRBREAD_PORTION = 200;

    public Gingerbread(String name, double price) {
        super(name,INITIAL_GINGRBREAD_PORTION, price);
    }
}
