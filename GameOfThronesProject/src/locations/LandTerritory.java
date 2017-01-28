package locations;

import army.Infantry;
import army.Knight;
import army.SiegeEngine;
import houses.House;
import tokens.OrderToken;

import java.util.ArrayList;

/**
 * Created by Scott on 1/23/2017.
 */
public class LandTerritory implements Territory {

    private String name;
    private int numSupply;
    private int numCrowns;
    private int numInfantry;
    private int numKnight;
    private int numSiegeEngine;
    private boolean hasCastle;
    private boolean hasStronghold;
    private boolean isOccupied;
    private House houseOccupied;
    private OrderToken orderToken;
    private ArrayList<String> connections;
    ArrayList<Knight> knights = new ArrayList<Knight>();
    ArrayList<Infantry> infantry = new ArrayList<Infantry>();
    ArrayList<SiegeEngine> siegeEngines = new ArrayList<SiegeEngine>();

    public LandTerritory() {

    }

    public LandTerritory(String name, int numSupply, int numCrowns, int numInfantry, int numKnight, int numSiegeEngine,
                         boolean hasCastle, boolean hasStronghold, boolean isOccupied, House houseOccupied, OrderToken orderToken, ArrayList<String> connections) {
        this.name = name;
        this.numSupply = numSupply;
        this.numCrowns = numCrowns;
        this.hasCastle = hasCastle;
        this.hasStronghold = hasStronghold;
        this.numInfantry = infantry.size();
        this.numKnight = knights.size();
        this.isOccupied = isOccupied;
        this.numSiegeEngine = siegeEngines.size();
        this.houseOccupied = houseOccupied;
        this.orderToken = orderToken;
        this.connections = connections;
    }

    public void setInfantry(ArrayList<Infantry> infantry) {
        this.infantry = infantry;
    }

    public ArrayList<Infantry> getInfantry() {
        return this.infantry;
    }

    public void setKnights(ArrayList<Knight> knights) {
        this.knights = knights;
    }

    public ArrayList<Knight> getKnights() {
        return this.knights;
    }

    public String getName() {
        return this.name;
    }

    public int getNumSupply() {
        return this.numSupply;
    }

    public int getNumCrowns() {
        return this.numCrowns;
    }

    public boolean getHasCastle() {
        return this.hasCastle;
    }

    public boolean getHasStronghold() {
        return this.hasStronghold;
    }

    public boolean getIsOccupied() {
        if (houseOccupied == null) {
            return false;
        } else {
            return true;
        }
    }

    public void setNumInfantry(int numInfantry) {
        this.numInfantry = numInfantry;
    }

    public int getNumInfantry() {
        return this.infantry.size();
    }

    public void setNumKnight(int numKnight) {
        this.numKnight = numKnight;
    }

    public int getNumKnight() {
        return this.knights.size();
    }

    public void setNumSiegeEngine(int numSiegeEngine) {
        this.numSiegeEngine = numSiegeEngine;
    }

    public int getNumSiegeEngine() {
        return this.siegeEngines.size();
    }

    public void setHouseOccupied(House houseOccupied) {
        this.houseOccupied = houseOccupied;
    }

    public House getHouseOccupied() {
        return this.houseOccupied;
    }

    public void setOrderToken(OrderToken orderToken) {
        this.orderToken = orderToken;
    }

    public OrderToken getOrderToken() {
        return this.orderToken;
    }

    public ArrayList<String> getConnections() {
        return this.connections;
    }

    public void setConnections(ArrayList<String> connections) {
        this.connections = connections;
    }


}
