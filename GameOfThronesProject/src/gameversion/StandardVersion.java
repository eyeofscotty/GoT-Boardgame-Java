package gameversion;

//import References.References;
import References.*;
import houses.*;

import java.util.ArrayList;

/**
 * Created by Scott on 1/27/2017.
 */
public class StandardVersion implements GameVersion {

    private References references;
    private int numberOfPlayers;
    private int maxVictoryPoints = References.STANDARD_VICTORY_POINTS;
    private int maxTurns = References.STANDARD_MAX_TURNS;

    public StandardVersion(int numberOfPlayers, References references){
        this.numberOfPlayers = numberOfPlayers;
        this.references = references;
    }

    public void initalize(){
        determineHouses();
        setupTerritories();
    }



    private void setupTerritories(){

    }



    private void determineHouses(){
        this.references.allHouses = new ArrayList<House>();
        switch (this.numberOfPlayers){
            case 3:
                this.references.Stark = new HouseStark("Stark", 2, 5, 1, 1, 2, 3, 1, 2);
                this.references.Lannister = new HouseLannister("Lannister", 2, 5, 0, 1, 1, 2, 3, 3);
                this.references.Baratheon = new HouseBaratheon("Baratheon", 2, 5, 0, 1, 3, 1, 2, 1);
                this.references.allHouses.add(this.references.Stark);
                this.references.allHouses.add(this.references.Lannister);
                this.references.allHouses.add(this.references.Baratheon);
                break;

            case 4:
                this.references.Stark = new HouseStark("Stark", 2, 5, 1, 1, 2, 3, 2, 3);
                this.references.Lannister = new HouseLannister("Lannister", 2, 5, 0, 1, 1, 2, 6, 3);
                this.references.Baratheon = new HouseBaratheon("Baratheon", 2, 5, 0, 1, 3, 1, 2, 1);
                this.references.Greyjoy = new HouseGreyjoy("Greyjoy", 2, 5, 0, 1, 4, 4, 1, 0);
                this.references.allHouses.add(this.references.Stark);
                this.references.allHouses.add(this.references.Lannister);
                this.references.allHouses.add(this.references.Baratheon);
                this.references.allHouses.add(this.references.Greyjoy);
                break;
        }

    }


}
