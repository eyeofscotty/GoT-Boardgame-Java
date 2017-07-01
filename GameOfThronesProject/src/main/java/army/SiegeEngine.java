package army;

/**
 * Created by Scott on 1/23/2017.
 */
public class SiegeEngine implements Army {

    private int attackPower;
    private int defensePower;
    private int cost;
    private boolean routed;

    public SiegeEngine() {
        this.attackPower = 4;
        this.defensePower = 0;
        this.cost = 2;
        this.routed = false;
    }
    //Maybe have siege engines have 0 attack when not attacking stronghold/castle

    public int getAttackPower() {
        return this.attackPower;
    }

    public int getDefensePower() {
        return this.defensePower;
    }

    public int getCost() {
        return this.cost;
    }

    public boolean getRouted() {
        return this.routed;
    }

    public void setRouted(boolean routed) {
        this.routed = routed;
    }
}