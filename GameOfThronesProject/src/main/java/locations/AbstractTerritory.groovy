package locations

import army.Army
import army.armyGroupings.UnitGroupings
import houses.House
import tokens.OrderToken

class AbstractTerritory {
    String name
    boolean isOccupied
    House houseOccupied
    OrderToken orderToken
    UnitGroupings unitGroupings
    List<String> connections
    List<LandTerritoryImpl> landConnections
    List<SeaTerritory> seaConnections



    AbstractTerritory(String name, boolean isOccupied, House houseOccupied, OrderToken orderToken, UnitGroupings unitGroupings, List<String> connections){
        this.name = name
        this.isOccupied = isOccupied
        this.houseOccupied = houseOccupied
        this.orderToken = orderToken
        this.unitGroupings = unitGroupings
        this.connections = connections
    }

    AbstractTerritory(){

    }



}
