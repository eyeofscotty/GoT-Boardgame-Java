package References;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import locations.LandTerritory;
import locations.Territory;

import java.io.*;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Scott on 6/19/2017.
 */
public class TestingInitialize {

    public void convertJSON() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        try {
//            BufferedReader br = new BufferedReader(new FileReader("C:\\Code\\GoTProject\\GoT-Boardgame-Java\\GameOfThronesProject\\Resource\\landTerritory.json"));
            LandTerritory[] listOfLandTerritories =  mapper.readValue(new File("C:\\Code\\GoTProject\\GoT-Boardgame-Java\\GameOfThronesProject\\Resource\\landTerritory.json"), new TypeReference<LandTerritory[]>(){});
            HashMap<String, Territory> territoryNamesMap = new HashMap<String, Territory>();
            //Go with this approach some how
            //
            //
            for(LandTerritory landTerritory: listOfLandTerritories){
                territoryNamesMap.put(landTerritory.getName(), landTerritory);
            }
            System.out.println(territoryNamesMap.toString());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
