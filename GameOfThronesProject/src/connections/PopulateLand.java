package connections;

import References.References;
import locations.LandTerritory;

import java.io.*;
import java.util.ArrayList;
import java.util.Dictionary;

/**
 * Created by Scott on 1/23/2017.
 */
public class PopulateLand {
    

//            private LandTerritory parseGoodies(String line)
//            {
//                ArrayList<String> placeHolderConnections = new ArrayList<String>();
//                int numCrowns = 0;
//                int numSupply = 0;
//                boolean hasCastle = false;
//                boolean hasStronghold = false;
//                boolean hasPort = false;
//                boolean isOccupied = false;
//                String[] splitLine = line.Split(':');
//                String name = splitLine[0];
//                String[] goodies = splitLine[1].Split(',');
//                LandTerritory land;
//                foreach (String s in goodies)
//                {
//                    if(s.Trim().Equals("CROWN")){
//                        numCrowns++;
//                    }
//                    if(s.Trim().Equals("SUPPLY")){
//                        numSupply++;
//                    }
//                    if(s.Trim().Equals("CASTLE")){
//                        hasCastle = true;
//                    }
//                    if(s.Trim().Equals("STRONGHOLD")){
//                        hasStronghold = true;
//                    }
//                    if(s.Trim().Equals("PORT")){
//                        hasPort = true;
//                    }
//                }
//
//                land = new LandTerritory(name, numSupply, numCrowns, 0, 0, 0, hasCastle, hasStronghold, isOccupied, References.References.Neutral, new PlaceHolderOrderToken(), placeHolderConnections);
//                allLands.Add(name, land);
//                return land;
//            }
//
//            public Dictionary<String,LandTerritory> populateLand(String textFile)
//            {
//                File file = new File(textFile);
//                try {
//                    BufferedReader reader = new BufferedReader(new FileReader(file));
//                    String line;
//                    while ((line = reader.readLine()) != null) {
//                        String[] splitLine = line.split(":");
//                        String name = splitLine[0];
//                        switch (name){
//                            //Populates the territories
//                            case "Castle_Black":
//                                References.References.Castle_Black = parseGoodies(line);
//                                break;
//
//                            case "Karhold":
//                                References.References.Karhold = parseGoodies(line);
//                                break;
//                            case "Winterfell":
//                                References.References.Winterfell = parseGoodies(line);
//                                break;
//                            case "The_Stony_Shore":
//                                References.References.The_Stony_Shore = parseGoodies(line);
//                                break;
//                            case "White_Harbor":
//                                References.References.White_Harbor = parseGoodies(line);
//                                break;
//                            case "Widows_Watch":
//                                References.References.Widows_Watch = parseGoodies(line);
//                                break;
//                            case "Moat_Cailin":
//                                References.References.Moat_Cailin = parseGoodies(line);
//                                break;
//                            case "Greywater_Watch":
//                                References.References.Greywater_Watch = parseGoodies(line);
//                                break;
//                            case "Flints_Fingers":
//                                References.References.Flints_Fingers = parseGoodies(line);
//                                break;
//                            case "Seagard":
//                                References.References.Seagard = parseGoodies(line);
//                                break;
//                            case "Pyke":
//                                References.References.Pyke = parseGoodies(line);
//                                break;
//                            case "The_Twins":
//                                References.References.The_Twins = parseGoodies(line);
//                                break;
//                            case "The_Fingers":
//                                References.References.The_Fingers = parseGoodies(line);
//                                break;
//                            case "The Mountains_Of_The_Moon":
//                                References.References.The_Mountains_Of_The_Moon = parseGoodies(line);
//                                break;
//                            case "The_Eyrie":
//                                References.References.The_Eyrie = parseGoodies(line);
//                                break;
//                            case "Riverrun":
//                                References.References.Riverrun = parseGoodies(line);
//                                break;
//                            case "Lannisport":
//                                References.References.Lannisport = parseGoodies(line);
//                                break;
//                            case "Stoney_Sept":
//                                References.References.Stoney_Sept = parseGoodies(line);
//                                break;
//                            case "Harrenhal":
//                                References.References.Harrenhal = parseGoodies(line);
//                                break;
//                            case "Crackclaw_Point":
//                                References.References.Crackclaw_Point = parseGoodies(line);
//                                break;
//                            case "Searoad_Marches":
//                                References.References.Searoad_Marches = parseGoodies(line);
//                                break;
//                            case "Blackwater":
//                                References.References.Blackwater = parseGoodies(line);
//                                break;
//                            case "Kings_Landing":
//                                References.References.Kings_Landing = parseGoodies(line);
//                                break;
//                            case "Dragonstone":
//                                References.References.Dragonstone = parseGoodies(line);
//                                break;
//                            case "Highgarden":
//                                References.References.Highgarden = parseGoodies(line);
//                                break;
//                            case "The_Reach":
//                                References.References.The_Reach = parseGoodies(line);
//                                break;
//                            case "Kingswood":
//                                References.References.Kingswood = parseGoodies(line);
//                                break;
//                            case "Storms_End":
//                                References.References.Storms_End = parseGoodies(line);
//                                break;
//                            case "The_Boneway":
//                                References.References.The_Boneway = parseGoodies(line);
//                                break;
//                            case "Dornish_Marches":
//                                References.References.Dornish_Marches = parseGoodies(line);
//                                break;
//                            case "Oldtown":
//                                References.References.Oldtown = parseGoodies(line);
//                                break;
//                            case "Three_Towers":
//                                References.References.Three_Towers = parseGoodies(line);
//                                break;
//                            case "Princes_Pass":
//                                References.References.Princes_Pass = parseGoodies(line);
//                                break;
//                            case "Yronwood":
//                                References.References.Yronwood = parseGoodies(line);
//                                break;
//                            case "Sunspear":
//                                References.References.Sunspear = parseGoodies(line);
//                                break;
//                            case "Starfall":
//                                References.References.Starfall = parseGoodies(line);
//                                break;
//                            case "Salt_Shore":
//                                References.References.Salt_Shore = parseGoodies(line);
//                                break;
//                            case "The_Arbor":
//                                References.References.The_Arbor = parseGoodies(line);
//                                break;
//
//                            default:
//
//                                break;
//
//                        }
//                    }
//
//                } catch (FileNotFoundException e) {
//                    e.printStackTrace();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                return allLands;
//            }
//
//        }
//    }


}
