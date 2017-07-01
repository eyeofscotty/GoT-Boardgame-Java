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
    private boolean hasCastle;
    private boolean hasStronghold;
    private boolean isOccupied;
    private House houseOccupied;
    private OrderToken orderToken;

    private boolean powerToken;
    private int numGarrison;
    //Do something for garrisons and neutral tokens like kingslanding/eyrie
    //Also do stuff for ports

    private ArrayList<String> landConnections;
    ArrayList<Knight> knights = new ArrayList<Knight>();
    ArrayList<Infantry> infantry = new ArrayList<Infantry>();
    ArrayList<SiegeEngine> siegeEngines = new ArrayList<SiegeEngine>();

    public LandTerritory(String name, int numSupply, int numCrowns, int numGarrison, ArrayList<Infantry> infantry, ArrayList<Knight> knights, ArrayList<SiegeEngine> siegeEngines, boolean powerToken, boolean hasCastle, boolean hasStronghold, boolean isOccupied, House houseOccupied, OrderToken orderToken, ArrayList<String> landConnections){

        this.name = name;
        this.numGarrison = numGarrison;
        this.powerToken = powerToken;
        this.numSupply = numSupply;
        this.numCrowns = numCrowns;
        this.hasCastle = hasCastle;
        this.hasStronghold = hasStronghold;
        this.infantry = infantry;
        this.knights = knights;
        this.isOccupied = isOccupied;
        this.siegeEngines = siegeEngines;
        this.houseOccupied = houseOccupied;
        this.orderToken = orderToken;
        this.landConnections = landConnections;
    }

    public LandTerritory(){

    }

    public boolean isPowerToken() {
        return powerToken;
    }

    public void setPowerToken(boolean powerToken) {
        this.powerToken = powerToken;
    }

    public int getNumGarrison() {
        return numGarrison;
    }

    public void setNumGarrison(int numGarrison) {
        this.numGarrison = numGarrison;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumSupply() {
        return numSupply;
    }

    public void setNumSupply(int numSupply) {
        this.numSupply = numSupply;
    }

    public boolean hasCrowns(){ return numCrowns > 0 ? true : false; }

    public int getNumCrowns() {
        return numCrowns;
    }

    public void setNumCrowns(int numCrowns) {
        this.numCrowns = numCrowns;
    }

    public boolean getHasCastle() {
        return hasCastle;
    }

    public void setHasCastle(boolean hasCastle) {
        this.hasCastle = hasCastle;
    }

    public boolean getHasStronghold() {
        return hasStronghold;
    }

    public void setHasStronghold(boolean hasStronghold) {
        this.hasStronghold = hasStronghold;
    }

    public boolean getIsOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public House getHouseOccupied() {
        return houseOccupied;
    }

    public void setHouseOccupied(House houseOccupied) {
        this.houseOccupied = houseOccupied;
    }

    public OrderToken getOrderToken() {
        return orderToken;
    }

    public void setOrderToken(OrderToken orderToken) {
        this.orderToken = orderToken;
    }

    public ArrayList<String> getLandConnections() {
        return landConnections;
    }

    @Override
    public String toString() {
        return "LandTerritory{" +
                "name='" + name + '\'' +
                ", numSupply=" + numSupply +
                ", numCrowns=" + numCrowns +
                ", hasCastle=" + hasCastle +
                ", hasStronghold=" + hasStronghold +
                ", isOccupied=" + isOccupied +
                ", houseOccupied=" + houseOccupied +
                ", orderToken=" + orderToken +
                ", powerToken=" + powerToken +
                ", numGarrison=" + numGarrison +
                ", landConnections=" + landConnections +
                ", knights=" + knights +
                ", infantry=" + infantry +
                ", siegeEngines=" + siegeEngines +
                '}';
    }

    public void setLandConnections(ArrayList<String> landConnections) {
        this.landConnections = landConnections;
    }

    public ArrayList<Knight> getKnights() {
        return knights;
    }

    public void setKnights(ArrayList<Knight> knights) {
        this.knights = knights;
    }

    public ArrayList<Infantry> getInfantry() {
        return infantry;
    }

    public void setInfantry(ArrayList<Infantry> infantry) {
        this.infantry = infantry;
    }

    public ArrayList<SiegeEngine> getSiegeEngines() {
        return siegeEngines;
    }

    public void setSiegeEngines(ArrayList<SiegeEngine> siegeEngines) {
        this.siegeEngines = siegeEngines;
    }
}
