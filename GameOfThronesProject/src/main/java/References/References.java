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

    public static String CASTLE_BLACK = "Castle Black";
    public static String THE_STONEY_SHORE = "The Stoney Shore";
    public static String KARHOLD = "Karhold";
    public static String WIDOWS_WATCH = "Widows Watch";
    public static String WHITE_HARBOR = "White Harbor";
    public static String WINTERFELL = "Winterfell";
    public static String MOAT_CAILIN = "Moat Cailin";
    public static String GREYWAYTER_WATCH  = "Greywater Watch";
    public static String FLINTS_FINGERS = "Flints Fingers";
    public static String SEAGARD = "Seagard";
    public static String PYKE = "Pyke";
    public static String THE_TWINS = "The Twins";
    public static String THE_FINGERS = "The Fingers";
    public static String THE_MOUNTAINS_OF_THE_MOON = "The Mountains Of The Moon";
    public static String THE_EYRIE = "The Eyrie";
    public static String RIVERRUN = "Rivverun";
    public static String LANNISPORT = "Lannisport";
    public static String STONEY_SEPT = "Stoney Sept";
    public static String HARRENHAL = "Harrenhal";
    public static String CRACKCLAW_POINT = "Crackclaw Point";
    public static String SEAROAD_MARCHES = "Searoad Marches";
    public static String BLACKWATER = "Blackwater";
    public static String KINGS_LANDING = "Kings Landing";
    public static String DRAGONSTONE = "Dragonstone";
    public static String HIGHGARDEN = "Highgarden";
    public static String THE_REACH = "The Reach";
    public static String KINGSWOOD = "Kingswood";
    public static String STORMS_END = "Storms End";
    public static String THE_BONEWAY = "The Boneway";
    public static String DORNISH_MARCHES = "Dornish Marches";
    public static String OLDTOWN = "Oldtown";
    public static String THREE_TOWERS = "Three Towers";
    public static String PRINCES_PASS = "Princes Pass";
    public static String YRONWOOD = "Yronwood";
    public static String SUNSPEAR = "Sunspear";
    public static String STARFALL = "Starfall";
    public static String SALT_SHORE = "Salt Shore";
    public static String THE_ARBOR = "The Arbor";

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

    public static String STARK = "Stark";
    public static String BARATHEON = "Baratheon";
    public static String GREYJOY = "Greyjoy";
    public static String LANNISTER = "Lannister";
    public static String TYRELL = "Tyrell";
    public static String MARTELL = "Martell";
    public static String ARRYN = "Arryn";
    public static String BOLTON = "Bolton";

    public ArrayList<House> allHouses;

    public ArrayList<String> allLandTerritoryNames;
    public ArrayList<String> allSeaTerritoryNames;

}
