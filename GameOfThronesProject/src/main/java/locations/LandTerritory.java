package locations;

import army.Infantry;
import army.Knight;
import army.SiegeEngine;
import houses.House;
import tokens.OrderToken;

import java.util.ArrayList;
import java.util.List;

@Deprecated
public class LandTerritory implements Territory {

    private String name;
    private int numSupply;
    private int numCrowns;
    private boolean hasCastle;
    private boolean hasStronghold;
    private boolean isOccupied;
    private House houseOccupied;
    private OrderToken orderToken;
    private LandTerritory bridgeConnection;

    private boolean powerToken;
    private int numGarrison;
    //Do something for garrisons and neutral tokens like kingslanding/eyrie
    //Also do stuff for ports

    private List<String> landConnections;
    private List<Knight> knights = new ArrayList<Knight>();
    private List<Infantry> infantry = new ArrayList<Infantry>();
    private List<SiegeEngine> siegeEngines = new ArrayList<SiegeEngine>();

    public LandTerritory(String name, int numSupply, int numCrowns, int numGarrison, List<Infantry> infantry, List<Knight> knights, List<SiegeEngine> siegeEngines, boolean powerToken, boolean hasCastle, boolean hasStronghold, boolean isOccupied, House houseOccupied, OrderToken orderToken, List<String> landConnections){
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

    public boolean getPowerToken() {
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

    public boolean getIsOccupied() {return this.houseOccupied != null ? true : false; }

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

    public List<String> getLandConnections() {
        return landConnections;
    }

    public void setLandConnections(List<String> landConnections) {
        this.landConnections = landConnections;
    }

    public List<Knight> getKnights() {
        return knights;
    }

    public void setKnights(List<Knight> knights) {
        this.knights = knights;
    }

    public List<Infantry> getInfantry() {
        return infantry;
    }

    public void setInfantry(List<Infantry> infantry) {
        this.infantry = infantry;
    }

    public List<SiegeEngine> getSiegeEngines() {
        return siegeEngines;
    }

    public void setSiegeEngines(List<SiegeEngine> siegeEngines) {
        this.siegeEngines = siegeEngines;
    }

    @Override
    public String toString() {
        return "LandTerritory{" +
                "name='" + getName() + '\'' +
                ", numSupply=" + getNumSupply() +
                ", numCrowns=" + getNumCrowns() +
                ", hasCastle=" + getHasCastle() +
                ", hasStronghold=" + getHasStronghold() +
                ", isOccupied=" + getIsOccupied() +
                ", houseOccupied=" + getHouseOccupied() +
                ", orderToken=" + getOrderToken() +
                ", powerToken=" + getPowerToken() +
                ", numGarrison=" + getNumGarrison() +
                ", landConnections=" + getLandConnections() +
                ", knights=" + getKnights() +
                ", infantry=" + getInfantry() +
                ", siegeEngines=" + getSiegeEngines() +
                '}';
    }
}
