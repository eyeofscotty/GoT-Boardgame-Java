package gameversion;

import helper.ArmyHelper;
import houses.House;
import locations.LandTerritory;
import locations.LandTerritoryImpl;
import locations.SeaTerritory;

import java.util.HashMap;

public interface GameVersion {

    int getMaxTurns();
    int getMaxVictoryPoints();
    HashMap<String, House> assignStartingPositions();
    void setNumberOfPlayers(int numberOfPlayers);
    void setLandTerritoryMap(HashMap<String, LandTerritoryImpl> landTerritoryMap);
    void setSeaTerritoryMap(HashMap<String, SeaTerritory> seaTerritoryMap);
    void setHouseMap(HashMap<String, House> houseMap) ;
}
