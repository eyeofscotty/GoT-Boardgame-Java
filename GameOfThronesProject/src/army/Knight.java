package army;

/**
 * Created by Scott on 1/23/2017.
 */
public class Knight implements Army {

    private int attackPower;
    private int defensePower;
    private int cost;
    private boolean routed;

    public Knight() {
        this.attackPower = 2;
        this.defensePower = 2;
        this.cost = 2;
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


