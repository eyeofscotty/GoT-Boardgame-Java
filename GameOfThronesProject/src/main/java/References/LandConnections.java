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

//    public static List<LandTerritory> THE_STONY_SHORE_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantWinterfell));
//    public List<LandTerritory> CASTLE_BLACK_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantWinterfell, ReferenceConstantKarhold));
////    public static List<LandTerritory> KARHOLD_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantWinterfell, ReferenceConstantCastle_Black));
//    public static List<LandTerritory> WIDOWS_WATCH_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantWhite_Harbor));
//    public static List<LandTerritory> WHITE_HARBOR_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantWidows_Watch, ReferenceConstantWinterfell, ReferenceConstantMoat_Cailin));
////    public static List<LandTerritory> WINTERFELL_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantWhite_Harbor, ReferenceConstantKarhold, ReferenceConstantCastle_Black, ReferenceConstantMoat_Cailin, ReferenceConstantThe_Stony_Shore));
//    public static List<LandTerritory> FLINTS_FINGERS_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantGreywater_Watch));
//    public static List<LandTerritory> GREYWATER_WATCH_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantFlints_Fingers, ReferenceConstantSeagard, ReferenceConstantMoat_Cailin));
//    public static List<LandTerritory> MOAT_CAILIN_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantGreywater_Watch, ReferenceConstantSeagard, ReferenceConstantThe_Twins, ReferenceConstantWinterfell, ReferenceConstantWhite_Harbor));
//    public static List<LandTerritory> Pyke_LAND_CONNECTIONS = null;
//    public static List<LandTerritory> SEAGARD_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantGreywater_Watch, ReferenceConstantMoat_Cailin, ReferenceConstantThe_Twins, ReferenceConstantRiverrun));
//    public static List<LandTerritory> THE_TWINS_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantSeagard, ReferenceConstantMoat_Cailin, ReferenceConstantThe_Fingers, ReferenceConstantThe_Mountains_Of_The_Moon));
//    public static List<LandTerritory> THE_FINGERS_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantThe_Twins, ReferenceConstantThe_Mountains_Of_The_Moon));
//    public static List<LandTerritory> THE_MOUNTAINS_OF_THE_MOON_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantThe_Twins, ReferenceConstantThe_Fingers, ReferenceConstantThe_Eyrie, ReferenceConstantCrackclaw_Point));
//    public static List<LandTerritory> THE_EYRIE_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantThe_Mountains_Of_The_Moon));
//    public static List<LandTerritory> RIVERRUN_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantSeagard, ReferenceConstantHarrenhal, ReferenceConstantStoney_Sept, ReferenceConstantLannisport));
//    public static List<LandTerritory> LANNISPORT_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantSearoad_Marches, ReferenceConstantStoney_Sept, ReferenceConstantRiverrun, ReferenceConstantHarrenhal));
//    public static List<LandTerritory> STONEY_SEPT_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantSearoad_Marches, ReferenceConstantLannisport, ReferenceConstantBlackwater, ReferenceConstantRiverrun, ReferenceConstantHarrenhal));
//    public static List<LandTerritory> HARRENHAL_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantRiverrun, ReferenceConstantStoney_Sept, ReferenceConstantBlackwater, ReferenceConstantCrackclaw_Point));
//    public static List<LandTerritory> CRACKCLAW_POINT_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantHarrenhal, ReferenceConstantBlackwater, ReferenceConstantKings_Landing));
//    public static List<LandTerritory> DRAGONSTONE_LAND_CONNECTIONS =  null;
//    public static List<LandTerritory> SEAROAD_MARCHES_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantLannisport, ReferenceConstantStoney_Sept, ReferenceConstantBlackwater, ReferenceConstantHighgarden));
//    public static List<LandTerritory> BLACKWATER_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantStoney_Sept, ReferenceConstantSearoad_Marches, ReferenceConstantHarrenhal, ReferenceConstantCrackclaw_Point, ReferenceConstantThe_Reach, ReferenceConstantKings_Landing));
//    public static List<LandTerritory> KINGS_LANDING_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantCrackclaw_Point, ReferenceConstantThe_Reach, ReferenceConstantKingswood, ReferenceConstantBlackwater));
//    public static List<LandTerritory> HIGH_GARDEN_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantSearoad_Marches, ReferenceConstantThe_Reach, ReferenceConstantOldtown, ReferenceConstantDornish_Marches));
//    public static List<LandTerritory> THE_REACH_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantHighgarden, ReferenceConstantDornish_Marches, ReferenceConstantThe_Boneway, ReferenceConstantKings_Landing, ReferenceConstantKingswood));
//    public static List<LandTerritory> KINGSWOOD_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantThe_Reach, ReferenceConstantKings_Landing, ReferenceConstantThe_Boneway, ReferenceConstantStorms_End));
//    public static List<LandTerritory> STORMS_END_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantThe_Boneway, ReferenceConstantKingswood));
//    public static List<LandTerritory> THE_BONEWAY_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantKingswood, ReferenceConstantStorms_End, ReferenceConstantThe_Reach, ReferenceConstantDornish_Marches, ReferenceConstantPrinces_Pass, ReferenceConstantYronwood));
//    public static List<LandTerritory> OLDTOWN_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantHighgarden, ReferenceConstantDornish_Marches, ReferenceConstantThree_Towers));
//    public static List<LandTerritory> DONRISH_MARCHES_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantThe_Reach, ReferenceConstantHighgarden, ReferenceConstantOldtown, ReferenceConstantThe_Boneway, ReferenceConstantThree_Towers, ReferenceConstantPrinces_Pass));
//    public static List<LandTerritory> THREE_TOWERES_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantOldtown, ReferenceConstantDornish_Marches, ReferenceConstantPrinces_Pass));
//    public static List<LandTerritory> PRINCES_PASS_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantThe_Boneway, ReferenceConstantDornish_Marches, ReferenceConstantThree_Towers, ReferenceConstantYronwood, ReferenceConstantStarfall));
//    public static List<LandTerritory> THE_ARBOR_SHORE_LAND_CONNECTIONS = null;
//    public static List<LandTerritory> STAR_FALL_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantPrinces_Pass, ReferenceConstantYronwood, ReferenceConstantSalt_Shore));
//    public static List<LandTerritory> YRONWOOD_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantThe_Boneway, ReferenceConstantPrinces_Pass, ReferenceConstantStarfall, ReferenceConstantSalt_Shore));
//    public static List<LandTerritory> SALT_SHORE_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantYronwood, ReferenceConstantStarfall, ReferenceConstantSunspear));
//    public static List<LandTerritory> SUNSPEAR_LAND_CONNECTIONS = new ArrayList<LandTerritory>(Arrays.asList(ReferenceConstantSalt_Shore, ReferenceConstantYronwood));














}
