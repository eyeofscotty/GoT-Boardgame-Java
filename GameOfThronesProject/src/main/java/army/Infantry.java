package army;

/**
 * Created by Scott on 1/23/2017.
 */
public class Infantry {

    private int attackPower;
    private int defensePower;
    private int cost;
    private boolean routed;

    public Infantry() {
        this.attackPower = 1;
        this.defensePower = 1;
        this.cost = 1;
        this.routed = false;
    }

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
