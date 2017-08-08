package locations;

import army.Ship;
import houses.House;
import tokens.OrderToken;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Scott on 1/23/2017.
 */
public class SeaTerritory implements Territory {

    String name;
    int numShips;
    boolean isOccupied;
    House houseOccupied;
    OrderToken orderToken;
    List<String> landConnections, seaConnections;
    List<Ship> ships = new ArrayList<Ship>();

    public SeaTerritory(String name, int numShips, House houseOccupied, boolean isOccupied, OrderToken orderToken, ArrayList<String> landConnections, List<String> seaConnections, List<Ship> ships) {
        this.name = name;
        this.numShips = numShips;
        this.houseOccupied = houseOccupied;
        this.orderToken = orderToken;
        this.landConnections = landConnections;
        this.seaConnections = seaConnections;
        this.isOccupied = isOccupied;
        this.ships = ships;
    }


    public String getName() {
        return this.name;
    }

    public void setNumShips(int numShips) {
        this.numShips = numShips;
    }

    public int getNumShips() {
        return this.ships.size();
    }

    public void setShips(List<Ship> ships){
        this.ships = ships;
    }

    public List<Ship> getShips(){
        return this.ships;
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

    public boolean getIsOccupied() {
        if (houseOccupied == null) {
            return false;
        } else {
            return true;
        }
    }

    public List<String> getSeaConnections() {
        return this.seaConnections;
    }

    public List<String> getLandConnections() {
        return this.landConnections;
    }

    public void setLandConnections(ArrayList<String> landConnections) {
        this.landConnections = landConnections;
    }

    public void setSeaConections(ArrayList<String> seaConnections) {
        this.seaConnections = seaConnections;
    }

}
