package army;

/**
 * Created by Scott on 1/23/2017.
 */
public interface Army {

    int getAttackPower();

    int getDefensePower();

    int getCost();

    boolean getRouted();

    void setRouted(boolean routed);
}
