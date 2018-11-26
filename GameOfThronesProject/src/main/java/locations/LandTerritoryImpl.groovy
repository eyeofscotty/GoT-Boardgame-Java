package locations

import army.Infantry
import army.Knight
import army.SiegeEngine
import army.armyGroupings.UnitGroupings
import houses.House
import tokens.OrderToken

class LandTerritoryImpl extends AbstractTerritory {
    private int numSupply;
    private int numCrowns;
    private boolean hasCastle;
    private boolean hasStronghold;
    private AbstractTerritory bridgeConnection;

    private boolean powerToken;
    private int numGarrison;
    //Do something for garrisons and neutral tokens like kingslanding/eyrie
    //Also do stuff for ports

    private List<String> connections
    private UnitGroupings unitGroupings

    public LandTerritoryImpl(String name, int numSupply, int numCrowns, int numGarrison, UnitGroupings unitGroupings, boolean powerToken, boolean hasCastle, boolean hasStronghold, boolean isOccupied, House houseOccupied, OrderToken orderToken, List<String> connections){
        super(name, isOccupied, houseOccupied, orderToken, unitGroupings)
        this.numGarrison = numGarrison
        this.powerToken = powerToken
        this.numSupply = numSupply
        this.numCrowns = numCrowns
        this.hasCastle = hasCastle
        this.hasStronghold = hasStronghold
        this.orderToken = orderToken
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
                ", houseOccupied=" + houseOccupied() +
                ", orderToken=" + orderToken +
                ", powerToken=" + powerToken +
                ", numGarrison=" + numGarrison +
                ", landConnections=" + landConnections +
                ", knights=" + knights +
                ", infantry=" + infantry +
                ", siegeEngines=" + siegeEngines
    }
}
