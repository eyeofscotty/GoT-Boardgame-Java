package References;

import army.Infantry;
import army.Knight;
import connections.CreateConnections;
import connections.PopulateLand;
import connections.SeaConnections;
import connections.SeaToLandConnections;
import houses.*;
import locations.LandTerritory;
import locations.SeaTerritory;
import tokens.*;

import java.io.IOException;
import java.util.ArrayList;


/**
 * Created by Scott on 1/24/2017.
 */
public class Initialize {

    public ArrayList<House> allHouses = new ArrayList<House>();
    public ArrayList<OrderToken> allOrderTokens = new ArrayList<OrderToken>();
    References references;

    public Initialize(References references){
        this.references = references;
    }


    public void initialize(int numPlayers){
        references.Stark = new HouseStark();
        references.Martell = new HouseMartell();
    }


//    public void initializeGame() throws IOException {
//        References.References.Stark = new HouseStark();
//        References.References.Baratheon = new HouseBaratheon();
//        References.References.Greyjoy = new HouseGreyjoy();
//        References.References.Lannister = new HouseLannister();
//        References.References.Tyrell = new HouseTyrell();
//        References.References.Martell = new HouseMartell();
//
//        assignOrderTokenArrayLists(References.References.Stark, createOrderTokens());
//        assignOrderTokenArrayLists(References.References.Martell, createOrderTokens());
//        assignOrderTokenArrayLists(References.References.Greyjoy, createOrderTokens());
//        assignOrderTokenArrayLists(References.References.Baratheon, createOrderTokens());
//        assignOrderTokenArrayLists(References.References.Lannister, createOrderTokens());
//        assignOrderTokenArrayLists(References.References.Tyrell, createOrderTokens());
//
//        setOrderTokenButtonDictionary();
//        FillMaxOrderTokens();
//
//        PopulateLand populate = new PopulateLand(this, main);
//        allLandConnections = populate.populateLand("C:\\Users\\User\\Desktop\\GameOfThronesProject\\LandTerritory.txt");
//        CreateConnections createConnectins = new CreateConnections(this);
//        createConnectins.createLandConnections("C:\\Users\\User\\Desktop\\GameOfThronesProject\\LandToLand.txt");
//
//        SeaConnections seaConnection = new SeaConnections(this, main);
//        allSeaConnections = seaConnection.createSeaConnections("C:\\Users\\User\\Desktop\\GameOfThronesProject\\SeaToSea.txt");
//        SeaToLandConnections seaToLand = new SeaToLandConnections();
//        seaToLand.createSeaToLandConnections("C:\\Users\\User\\Desktop\\GameOfThronesProject\\SeaToLand.txt");
//
//        allLandTerritoryNames = createConnectins.allLands("C:\\Users\\User\\Desktop\\GameOfThronesProject\\LandTerritory.txt");
//        allSeaTerritoryNames = seaToLand.allSeas("C:\\Users\\User\\Desktop\\GameOfThronesProject\\SeaToLand.txt");
//
//        setHouseStartingLand(References.References.Stark, References.References.Winterfell, 2, 2, 0);
//        setHouseStartingLand(References.References.Stark, References.References.White_Harbor, 1, 0, 0);
//        setHouseStartingSea(References.References.Stark, References.References.The_Shivering_Sea, 1);
//
//        setHouseStartingLand(References.References.Greyjoy, References.References.Pyke, 1, 1, 0);
//        setHouseStartingLand(References.References.Greyjoy, References.References.Greywater_Watch, 1, 0, 0);
//        setHouseStartingSea(References.References.Greyjoy, References.References.Ironmans_Bay, 1);
//        //Do The ports
//
//        setHouseStartingLand(References.References.Lannister, References.References.Lannisport, 1, 1, 0);
//        setHouseStartingLand(References.References.Lannister, References.References.Stoney_Sept, 1, 0, 0);
//        setHouseStartingSea(References.References.Lannister, References.References.The_Golden_Sound, 1);
//
//        setHouseStartingLand(References.References.Baratheon, References.References.Dragonstone, 1, 1, 0);
//        setHouseStartingLand(References.References.Baratheon, References.References.Kingswood, 1, 0, 0);
//        setHouseStartingSea(References.References.Baratheon, References.References.Shipbreaker_Bay, 2);
//
//        setHouseStartingLand(References.References.Tyrell, References.References.Highgarden, 1, 1, 0);
//        setHouseStartingLand(References.References.Tyrell, References.References.Dornish_Marches, 1, 0, 0);
//        setHouseStartingSea(References.References.Tyrell, References.References.Redwyne_Straights, 1);
//
//        setHouseStartingLand(References.References.Martell, References.References.Sunspear, 1, 1, 0);
//        setHouseStartingLand(References.References.Martell, References.References.Salt_Shore, 1, 0, 0);
//        setHouseStartingSea(References.References.Martell, References.References.Sea_Of_Dorne, 1);
//
//        ArrayListAllHouses();
//
//    }

//    public void copyAllOrderTokensToAvailable() {
//        Stark.setAvailableOrderTokens(Stark.getAllOrderTokens());
//        Tyrell.setAvailableOrderTokens(Tyrell.getAllOrderTokens());
//        Martell.setAvailableOrderTokens(Martell.getAllOrderTokens());
//        Baratheon.setAvailableOrderTokens(Baratheon.getAllOrderTokens());
//        Lannister.setAvailableOrderTokens(Lannister.getAllOrderTokens());
//        Greyjoy.setAvailableOrderTokens(Greyjoy.getAllOrderTokens());
//        FillMaxOrderTokens();
//    }

//    public void FillMaxOrderTokens() {
//        References.References.Stark.setAllOrderTokens(createOrderTokens());
//        References.References.Tyrell.setAllOrderTokens(createOrderTokens());
//        References.References.Baratheon.setAllOrderTokens(createOrderTokens());
//        References.References.Greyjoy.setAllOrderTokens(createOrderTokens());
//        References.References.Martell.setAllOrderTokens(createOrderTokens());
//        References.References.Lannister.setAllOrderTokens(createOrderTokens());
//    }

    public void assignOrderTokenArrayLists(House house, ArrayList<OrderToken> orderTokenArrayList) {
        house.setAvailableOrderTokens(orderTokenArrayList);
    }

    public ArrayList<OrderToken> createOrderTokens() {
        ArrayList<OrderToken> ArrayList = new ArrayList<OrderToken>();

        ArrayList.add(new MarchOrder(true, false, false, true));
        ArrayList.add(new MarchOrder(false, true, false, true));
        ArrayList.add(new MarchOrder(false, false, true, true));

        ArrayList.add(new DefenseOrder(true, true));
        ArrayList.add(new DefenseOrder(false, true));
        ArrayList.add(new DefenseOrder(false, true));

        ArrayList.add(new SupportOrder(true, true));
        ArrayList.add(new SupportOrder(false, true));
        ArrayList.add(new SupportOrder(false, true));

        ArrayList.add(new RaidOrder(true, true));
        ArrayList.add(new RaidOrder(false, true));
        ArrayList.add(new RaidOrder(false, true));

        ArrayList.add(new ConsolidatePower(true, true));
        ArrayList.add(new ConsolidatePower(false, true));
        ArrayList.add(new ConsolidatePower(false, true));

        return ArrayList;
    }

    private void setOrderTokenButtonDictionary() {
        MarchOrder marchStar = (new MarchOrder(true, false, false, true));
        MarchOrder marchZero = (new MarchOrder(false, true, false, true));
        MarchOrder marchNeg = (new MarchOrder(false, false, true, true));

        DefenseOrder defenseStar = (new DefenseOrder(true, true));
        DefenseOrder defense1 = (new DefenseOrder(false, true));
        DefenseOrder defense2 = (new DefenseOrder(false, true));

        SupportOrder supportStar = (new SupportOrder(true, true));
        SupportOrder support1 = (new SupportOrder(false, true));
        SupportOrder support2 = (new SupportOrder(false, true));

        RaidOrder raidStar = (new RaidOrder(true, true));
        RaidOrder raid1 = (new RaidOrder(false, true));
        RaidOrder raid2 = (new RaidOrder(false, true));

        ConsolidatePower consolidatePowerStar = (new ConsolidatePower(true, true));
        ConsolidatePower consolidatePower1 = (new ConsolidatePower(false, true));
        ConsolidatePower consolidatePower2 = (new ConsolidatePower(false, true));

        allOrderTokens.add(marchStar);
        allOrderTokens.add(marchZero);
        allOrderTokens.add(marchNeg);
        allOrderTokens.add(defenseStar);
        allOrderTokens.add(defense1);
        allOrderTokens.add(defense2);
        allOrderTokens.add(supportStar);
        allOrderTokens.add(support1);
        allOrderTokens.add(support2);
        allOrderTokens.add(raidStar);
        allOrderTokens.add(raid1);
        allOrderTokens.add(raid2);
        allOrderTokens.add(consolidatePowerStar);
        allOrderTokens.add(consolidatePower1);
        allOrderTokens.add(consolidatePower2);

    }


    public void setHouseStartingLand(House house, LandTerritory land, int numInfantry, int numKnights, int numSiegeEngine) {
        ArrayList<Infantry> infantry = new ArrayList<Infantry>();
        ArrayList<Knight> knight = new ArrayList<Knight>();
        land.setHouseOccupied(house);
        land.setNumInfantry(numInfantry);
        for (int i = 0; i < numInfantry; i++) {
            infantry.add(new Infantry());
        }
        land.setInfantry(infantry);
        land.setNumKnight(numKnights);
        for (int i = 0; i < numKnights; i++) {
            knight.add(new Knight());
        }
        land.setKnights(knight);

    }

//    public void ArrayListAllHouses() {
//        allHouses.add(References.References.Stark);
//        allHouses.add(References.References.Tyrell);
//        allHouses.add(References.References.Martell);
//        allHouses.add(References.References.Greyjoy);
//        allHouses.add(References.References.Baratheon);
//        allHouses.add(References.References.Lannister);
//    }

    public void setHouseStartingSea(House house, SeaTerritory sea, int numShips) {
        sea.setHouseOccupied(house);
        sea.setNumShips(numShips);
    }
}
