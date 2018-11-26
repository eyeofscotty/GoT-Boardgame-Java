package gameversion;

import References.ReferenceConstant;
import helper.ArmyHelper;
import houses.*;
import locations.LandTerritory;
import locations.SeaTerritory;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Scott on 1/27/2017.
 */
public class StandardVersion implements GameVersion {

    private int MAX_VICTORY_POINTS = 7;
    private int MAX_TURNS = 10;

    private int numberOfPlayers;
    HashMap<String, LandTerritory> landTerritoryMap;
    HashMap<String, SeaTerritory> seaTerritoryMap;
    HashMap<String, House> houseMap;
    ArmyHelper armyHelper = new ArmyHelper();

    public StandardVersion(int numberOfPlayers, HashMap<String, LandTerritory> landTerritoryMap, HashMap<String, SeaTerritory> seaTerritoryMap){
        this.numberOfPlayers = numberOfPlayers;
        this.landTerritoryMap = landTerritoryMap;
        this.seaTerritoryMap = seaTerritoryMap;
    }

    public StandardVersion(){}

    private void setUpLandTerritory(LandTerritory landTerritory, House house, int infantry, int knights, int siege){
        landTerritory.setInfantry(armyHelper.initializeInfantry(infantry));
        landTerritory.setKnights(armyHelper.initalizeKnight(knights));
        landTerritory.setSiegeEngines(armyHelper.initializeSiege(siege));
        landTerritory.setHouseOccupied(house);
    }

    private void setUpSeaTerritory(SeaTerritory seaTerritory, House house, int ship){
        seaTerritory.setShips(armyHelper.initializeShip(ship));
        seaTerritory.setHouseOccupied(house);
    }

    public HashMap<String, House> assignStartingPositions() {
        //Make sure to do validation that number of players is between 3-6
        switch (this.numberOfPlayers){
            case 3:
                houseMap = initializeThreePlayers();
                //ToDO obvi make methods for each house
                //ToDO make helper method class that takes num of infantry and loops through to make list
                setUpLandTerritory(landTerritoryMap.get(ReferenceConstant.KARHOLD), houseMap.get(ReferenceConstant.STARK), 2,1,0);
                setUpLandTerritory(landTerritoryMap.get(ReferenceConstant.WINTERFELL), houseMap.get(ReferenceConstant.LANNISTER), 1,1,0);
                setUpLandTerritory(landTerritoryMap.get(ReferenceConstant.CASTLE_BLACK), houseMap.get(ReferenceConstant.BARATHEON), 2,2,0);
                break;

            case 4:
                houseMap = initializeFourPlayers();
                //TODO Add land and sea setup
                break;
            case 5:
                houseMap = initializeFivePlayers();
                //TODO Add land and sea setup
                break;

            case 6:
                houseMap = initializeSixPlayers();
                //TODO Add land and sea setup
                break;
        }
        return houseMap;
    }

    private HashMap<String, House> initializeThreePlayers(){
        HashMap<String, House> houses = new HashMap<String, House>();
        houses.put(ReferenceConstant.STARK, new HouseStark());
        houses.put(ReferenceConstant.LANNISTER, new HouseLannister());
        houses.put(ReferenceConstant.BARATHEON, new HouseBaratheon());
        return houses;
    }

    private HashMap<String, House> initializeFourPlayers(){
        HashMap<String, House> houses = new HashMap<String, House>();
        houses.put(ReferenceConstant.STARK, new HouseStark());
        houses.put(ReferenceConstant.LANNISTER, new HouseLannister());
        houses.put(ReferenceConstant.BARATHEON, new HouseBaratheon());
        houses.put(ReferenceConstant.GREYJOY, new HouseGreyjoy());
        return houses;
    }

    private HashMap<String, House> initializeFivePlayers(){
        HashMap<String, House> houses = new HashMap<String, House>();
        houses.put(ReferenceConstant.STARK, new HouseStark());
        houses.put(ReferenceConstant.LANNISTER, new HouseLannister());
        houses.put(ReferenceConstant.BARATHEON, new HouseBaratheon());
        houses.put(ReferenceConstant.GREYJOY, new HouseGreyjoy());
        houses.put(ReferenceConstant.TYRELL, new HouseTyrell());
        return houses;
    }

    private HashMap<String, House> initializeSixPlayers(){
        HashMap<String, House> houses = new HashMap<String, House>();
        houses.put(ReferenceConstant.STARK, new HouseStark());
        houses.put(ReferenceConstant.LANNISTER, new HouseLannister());
        houses.put(ReferenceConstant.BARATHEON, new HouseBaratheon());
        houses.put(ReferenceConstant.GREYJOY, new HouseGreyjoy());
        houses.put(ReferenceConstant.TYRELL, new HouseTyrell());
        houses.put(ReferenceConstant.MARTELL, new HouseMartell());
        return houses;
    }

    public int getMaxVictoryPoints(){
        return MAX_VICTORY_POINTS;
    }

    public int getMaxTurns(){
        return MAX_TURNS;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public void setLandTerritoryMap(HashMap<String, LandTerritory> landTerritoryMap) {
        this.landTerritoryMap = landTerritoryMap;
    }

    public void setSeaTerritoryMap(HashMap<String, SeaTerritory> seaTerritoryMap) {
        this.seaTerritoryMap = seaTerritoryMap;
    }

    public void setHouseMap(HashMap<String, House> houseMap) {
        this.houseMap = houseMap;
    }
}
