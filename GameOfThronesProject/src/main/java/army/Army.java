package army;

/**
 * Created by Scott on 1/20/2018.
 */
public abstract class Army {
    private int attackPower;
    private int defensePower;
    private int cost;
    private boolean routed;

    public Army(int attackPower, int defensePower, int cost, boolean routed){
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.cost = cost;
        this.routed = routed;
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
