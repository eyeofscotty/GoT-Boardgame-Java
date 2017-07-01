package References;

import locations.LandTerritory;

import java.sql.Ref;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Scott on 1/29/2017.
 */
public class LandConnections {

    public static List<LandTerritory> THE_STONY_SHORE_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Winterfell));
    public List<LandTerritory> CASTLE_BLACK_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Winterfell, References.Karhold));
//    public static List<LandTerritory> KARHOLD_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Winterfell, References.Castle_Black));
    public static List<LandTerritory> WIDOWS_WATCH_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.White_Harbor));
    public static List<LandTerritory> WHITE_HARBOR_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Widows_Watch, References.Winterfell, References.Moat_Cailin));
//    public static List<LandTerritory> WINTERFELL_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.White_Harbor, References.Karhold, References.Castle_Black, References.Moat_Cailin, References.The_Stony_Shore));
    public static List<LandTerritory> FLINTS_FINGERS_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Greywater_Watch));
    public static List<LandTerritory> GREYWATER_WATCH_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Flints_Fingers, References.Seagard, References.Moat_Cailin));
    public static List<LandTerritory> MOAT_CAILIN_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Greywater_Watch, References.Seagard, References.The_Twins, References.Winterfell, References.White_Harbor));
    public static List<LandTerritory> Pyke_LAND_CONNECTIONS = null;
    public static List<LandTerritory> SEAGARD_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Greywater_Watch, References.Moat_Cailin, References.The_Twins, References.Riverrun));
    public static List<LandTerritory> THE_TWINS_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Seagard, References.Moat_Cailin, References.The_Fingers, References.The_Mountains_Of_The_Moon));
    public static List<LandTerritory> THE_FINGERS_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.The_Twins, References.The_Mountains_Of_The_Moon));
    public static List<LandTerritory> THE_MOUNTAINS_OF_THE_MOON_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.The_Twins, References.The_Fingers, References.The_Eyrie, References.Crackclaw_Point));
    public static List<LandTerritory> THE_EYRIE_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.The_Mountains_Of_The_Moon));
    public static List<LandTerritory> RIVERRUN_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Seagard, References.Harrenhal, References.Stoney_Sept, References.Lannisport));
    public static List<LandTerritory> LANNISPORT_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Searoad_Marches, References.Stoney_Sept, References.Riverrun, References.Harrenhal));
    public static List<LandTerritory> STONEY_SEPT_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Searoad_Marches, References.Lannisport, References.Blackwater, References.Riverrun, References.Harrenhal));
    public static List<LandTerritory> HARRENHAL_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Riverrun, References.Stoney_Sept, References.Blackwater, References.Crackclaw_Point));
    public static List<LandTerritory> CRACKCLAW_POINT_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Harrenhal, References.Blackwater, References.Kings_Landing));
    public static List<LandTerritory> DRAGONSTONE_LAND_CONNECTIONS =  null;
    public static List<LandTerritory> SEAROAD_MARCHES_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Lannisport, References.Stoney_Sept, References.Blackwater, References.Highgarden));
    public static List<LandTerritory> BLACKWATER_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Stoney_Sept, References.Searoad_Marches, References.Harrenhal, References.Crackclaw_Point, References.The_Reach, References.Kings_Landing));
    public static List<LandTerritory> KINGS_LANDING_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Crackclaw_Point, References.The_Reach, References.Kingswood, References.Blackwater));
    public static List<LandTerritory> HIGH_GARDEN_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Searoad_Marches, References.The_Reach, References.Oldtown, References.Dornish_Marches));
    public static List<LandTerritory> THE_REACH_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Highgarden, References.Dornish_Marches, References.The_Boneway, References.Kings_Landing, References.Kingswood));
    public static List<LandTerritory> KINGSWOOD_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.The_Reach, References.Kings_Landing, References.The_Boneway, References.Storms_End));
    public static List<LandTerritory> STORMS_END_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.The_Boneway, References.Kingswood));
    public static List<LandTerritory> THE_BONEWAY_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Kingswood, References.Storms_End, References.The_Reach, References.Dornish_Marches, References.Princes_Pass, References.Yronwood));
    public static List<LandTerritory> OLDTOWN_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Highgarden, References.Dornish_Marches, References.Three_Towers));
    public static List<LandTerritory> DONRISH_MARCHES_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.The_Reach, References.Highgarden, References.Oldtown, References.The_Boneway, References.Three_Towers, References.Princes_Pass));
    public static List<LandTerritory> THREE_TOWERES_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Oldtown, References.Dornish_Marches, References.Princes_Pass));
    public static List<LandTerritory> PRINCES_PASS_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.The_Boneway, References.Dornish_Marches, References.Three_Towers, References.Yronwood, References.Starfall));
    public static List<LandTerritory> THE_ARBOR_SHORE_LAND_CONNECTIONS = null;
    public static List<LandTerritory> STAR_FALL_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Princes_Pass, References.Yronwood, References.Salt_Shore));
    public static List<LandTerritory> YRONWOOD_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.The_Boneway, References.Princes_Pass, References.Starfall, References.Salt_Shore));
    public static List<LandTerritory> SALT_SHORE_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Yronwood, References.Starfall, References.Sunspear));
    public static List<LandTerritory> SUNSPEAR_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(References.Salt_Shore, References.Yronwood));














}
