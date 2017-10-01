package game;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import gameversion.GameVersion;
import gameversion.StandardVersion;
import houses.House;
import locations.LandTerritory;
import locations.SeaTerritory;
import locations.Territory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Scott on 7/1/2017.
 */
public class SetupGame {
    public HashMap<String, LandTerritory> landTerritoryNamesMap;
    public HashMap<String, SeaTerritory> seaTerritoryNamesMap;
    public HashMap<String, House> houseMap;
    private int NUM_PLAYERS;
    private GameVersion gameVersion;

    public SetupGame(GameVersion gameVersion, int numPlayers){
        //TODO - assign starting house territories based on game version
        this.NUM_PLAYERS = numPlayers;
        this.gameVersion = gameVersion;
    }

    private void assignStartingTerritories(){
        //ToDo have a method to calculate supply, so it gets decoupled from default House Object
        gameVersion.setNumberOfPlayers(NUM_PLAYERS);
        gameVersion.setLandTerritoryMap(landTerritoryNamesMap);
        gameVersion.setSeaTerritoryMap(seaTerritoryNamesMap);
        //This is where houseMap comes from, dependant on GameVersion
        //Also initializes starting positions
        houseMap = gameVersion.assignStartingPositions();
    }

    public void setUp(){
        setUpLandTerritories();
        setUpSeaTerritories();
        assignStartingTerritories();
    }

    private void setUpLandTerritories(){
        ObjectMapper mapper = new ObjectMapper();
        try {
            LandTerritory[] listOfLandTerritories =  mapper.readValue(new File("Resource\\landTerritory.json"), new TypeReference<LandTerritory[]>(){});
            landTerritoryNamesMap = new HashMap<String, LandTerritory>();
            for(LandTerritory landTerritory: listOfLandTerritories){
                landTerritoryNamesMap.put(landTerritory.getName(), landTerritory);
            }
            System.out.println(landTerritoryNamesMap.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setUpSeaTerritories(){
        //TODO - same thing as land but for Sea
    }

    public HashMap<String, LandTerritory> getLandTerritoryNameMap(){
        return this.landTerritoryNamesMap;
    }
}
