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
 * Created by Scott on 1/23/2017.
 */
public class References {

    public static int STANDARD_MAX_TURNS = 10;
    public static int STANDARD_VICTORY_POINTS = 7;



    public static String STANNIS_BARATHEON = "Stannis Baratheon";
    public static String RENLY_BARATHEON = "Renly Baratheon";
    public static String SER_DAVOS_SEAWORTH = "Ser Davos Seaworth";
    public static String BRIENNE_OF_TARTH = "Brienne of Tarth";
    public static String SALLADHOR_SAAN = "Salladhor Saan";
    public static String MELISANDRE = "Melisandre";
    public static String PATCH_FACE = "Patchface";

    public static String EURON_CROWS_EYE = "Euoron Crow's Eye";
    public static String THEON_GREYJOY = "Theon Greyjoy";
    public static String BALON_GREYJOY = "Balon Greyjoy";
    public static String ASHA_GREYJOY = "Asha Greyjoy";
    public static String DAGMAR_CLEFTJAW = "Dagmar Cleftjaw";
    public static String AERON_DAMPHAIR = "Aeron Damphair";
    public static String VICTARION_GREYJOY = "Victarion Greyjoy";

    public static String SER_GREGOR_CLEGANE = "Ser Gregor Clegane";
    public static String TYWIN_LANNISTER = "Tywin Lannister";
    public static String SER_JAIME_LANNISTER = "Jaime Lannister";
    public static String THE_HOUND = "The Hound";
    public static String SER_KEVAN_LANNISTER = "Ser Kevan Lannister";
    public static String TYRION_LANNISTER = "Tyrion Lannister";
    public static String CERSEI_LANNISTER = "Cersei Lannister";

    public static String AREO_HOTAH = "Aero Hotah";
    public static String THE_RED_VIPER = "The Red Viper";
    public static String OBARA_SAND = "Obara Sand";
    public static String DARKSTAR = "Dark Star";
    public static String NYMERIA_SAND = "Nymeria Sand";
    public static String ARIANNE_MARTELL = "Arianne Martell";
    public static String DORAN_MARTELL = "Doran Martell";

    public static String ROBB_STARK = "Robb Stark";
    public static String EDDARD_STARK = "Eddard Stark";
    public static String GREAT_JOHN_UMBER = "Great John Umber";
    public static String ROOSE_BOLTON = "Roose Bolton";
    public static String THE_BLACK_FISH = "The Blackfish";
    public static String RODRIK_CASSEL = "Rodrik Cassel";

    public static String SER_LORAS_TYRELL = "Ser Loras Tyrell";
    public static String MACE_TYRELL = "Mace Tyrell";
    public static String SER_GARLEN_TYRELL = "Ser Garlen Tyrell";
    public static String RANDELL_TARLY = "Randell Tarly";
    public static String ALESTER_FLORENT = "Alester Florent";
    public static String MARGAERY_TYRELL = "Margaery Tyrell";
    public static String QUEEN_OF_THORNS = "Queen of Thorns";


    public static LandTerritory Castle_Black;
    public static LandTerritory The_Stony_Shore;
    public static LandTerritory Karhold;
    public static LandTerritory Widows_Watch;
    public static LandTerritory White_Harbor;
    public static LandTerritory Winterfell;
    public static LandTerritory Moat_Cailin;
    public static LandTerritory Greywater_Watch;
    public static LandTerritory Flints_Fingers;
    public static LandTerritory Seagard;
    public static LandTerritory Pyke;
    public static LandTerritory The_Twins;
    public static LandTerritory The_Fingers;
    public static LandTerritory The_Mountains_Of_The_Moon;
    public static LandTerritory The_Eyrie;
    public static LandTerritory Riverrun;
    public static LandTerritory Lannisport;
    public static LandTerritory Stoney_Sept;
    public static LandTerritory Harrenhal;
    public static LandTerritory Crackclaw_Point;
    public static LandTerritory Searoad_Marches;
    public static LandTerritory Blackwater;
    public static LandTerritory Kings_Landing;
    public static LandTerritory Dragonstone;
    public static LandTerritory Highgarden;
    public static LandTerritory The_Reach;
    public static LandTerritory Kingswood;
    public static LandTerritory Storms_End;
    public static LandTerritory The_Boneway;
    public static LandTerritory Dornish_Marches;
    public static LandTerritory Oldtown;
    public static LandTerritory Three_Towers;
    public static LandTerritory Princes_Pass;
    public static LandTerritory Yronwood;
    public static LandTerritory Sunspear;
    public static LandTerritory Starfall;
    public static LandTerritory Salt_Shore;
    public static LandTerritory The_Arbor;

    public static SeaTerritory The_Shivering_Sea;
    public static SeaTerritory The_Narrow_Sea;
    public static SeaTerritory Shipbreaker_Bay;
    public static SeaTerritory Blackwater_Bay;
    public static SeaTerritory Sea_Of_Dorne;
    public static SeaTerritory East_Summer_Sea;
    public static SeaTerritory West_Summer_Sea;
    public static SeaTerritory Redwyne_Straights;
    public static SeaTerritory Sunset_Sea;
    public static SeaTerritory The_Golden_Sound;
    public static SeaTerritory Ironmans_Bay;
    public static SeaTerritory Bay_Of_Ice;

    public HouseStark Stark;
    public HouseBaratheon Baratheon;
    public HouseGreyjoy Greyjoy;
    public HouseLannister Lannister;
    public HouseTyrell Tyrell;
    public HouseMartell Martell;
    public HouseNeutral Neutral = new HouseNeutral();

    public ArrayList<House> allHouses;

    public ArrayList<String> allLandTerritoryNames;
    public ArrayList<String> allSeaTerritoryNames;

}
