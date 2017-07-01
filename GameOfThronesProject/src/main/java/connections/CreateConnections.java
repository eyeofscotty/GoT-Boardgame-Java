package connections;

import References.References;

import java.util.ArrayList;

/**
 * Created by Scott on 1/23/2017.
 */
public class CreateConnections {
//
//        public class CreateConnections
//        {
//=
//
//            private ArrayList<String> makeConnections(String[] array)
//            {
//                ArrayList<String> ArrayList = new ArrayList<String>();
//                foreach (String s: array)
//                {
//                    if (!s.Equals("NA"))
//                    {
//                        ArrayList.add(s);
//                    }
//                }
//                return ArrayList;
//            }
//
//            public ArrayList<String> allLands(String textFile)
//            {
//                String line;
//                ArrayList<String> allLands = new ArrayList<String>();
//                using (StreamReader sr = new StreamReader(textFile))
//                {
//                    while ((line = sr.ReadLine()) != null)
//                    {
//                        String[] splitLine = line.Split(':');
//                        allLands.add(splitLine[0]);
//                    }
//
//                }
//
//                return allLands;
//            }
//
//            public void createLandConnections(String textFile)
//            {
//                using (StreamReader sr = new StreamReader(textFile))
//                {
//                    String line;
//                    while((line = sr.ReadLine()) != null)
//                    {
//                        String[] splitLine = line.Split(':');
//                        String name = splitLine[0];
//                        String[] connections;
//                        Console.WriteLine(name);
//                        Console.ReadLine();
//                        if (!splitLine[1].Equals("NA"))
//                        {
//                            connections = splitLine[1].Split(',');
//                        }
//                        else
//                        {
//                            connections = new String[1] { "NA" };
//                        }
//                        switch (name){
//                            //creates all the land territories
//                            case "Castle_Black":
//                                References.References.Castle_Black.setConnections(makeConnections(connections));
//                                break;
//
//                            case "Karhold":
//                                References.References.Karhold.setConnections(makeConnections(connections));
//                                break;
//                            case "Winterfell":
//                                References.References.Winterfell.setConnections(makeConnections(connections));
//                                break;
//                            case "The_Stony_Shore":
//                                References.References.The_Stony_Shore.setConnections(makeConnections(connections));
//                                break;
//                            case "White_Harbor":
//                                References.References.White_Harbor.setConnections(makeConnections(connections));
//                                break;
//                            case "Widows_Watch":
//                                References.References.Widows_Watch.setConnections(makeConnections(connections));
//                                break;
//                            case "Moat_Cailin":
//                                References.References.Moat_Cailin.setConnections(makeConnections(connections));
//                                break;
//                            case "Greywater_Watch":
//                                References.References.Greywater_Watch.setConnections(makeConnections(connections));
//                                break;
//                            case "Flints_Fingers":
//                                References.References.Flints_Fingers.setConnections(makeConnections(connections));
//                                break;
//                            case "Seagard":
//                                References.References.Seagard.setConnections(makeConnections(connections));
//                                break;
//                            case "Pyke":
//                                References.References.Pyke.setConnections(makeConnections(connections));
//                                break;
//                            case "The_Twins":
//                                References.References.The_Twins.setConnections(makeConnections(connections));
//                                break;
//                            case "The_Fingers":
//                                References.References.The_Fingers.setConnections(makeConnections(connections));
//                                break;
//                            case "The Mountains_Of_The_Moon":
//                                References.References.The_Mountains_Of_The_Moon.setConnections(makeConnections(connections));
//                                break;
//                            case "The_Eyrie":
//                                References.References.The_Eyrie.setConnections(makeConnections(connections));
//                                break;
//                            case "Riverrun":
//                                References.References.Riverrun.setConnections(makeConnections(connections));
//                                break;
//                            case "Lannisport":
//                                References.References.Lannisport.setConnections(makeConnections(connections));
//                                break;
//                            case "Stoney_Sept":
//                                References.References.Stoney_Sept.setConnections(makeConnections(connections));
//                                break;
//                            case "Harrenhal":
//                                References.References.Harrenhal.setConnections(makeConnections(connections));
//                                break;
//                            case "Crackclaw_Point":
//                                References.References.Crackclaw_Point.setConnections(makeConnections(connections));
//                                break;
//                            case "Searoad_Marches":
//                                References.References.Searoad_Marches.setConnections(makeConnections(connections));
//                                break;
//                            case "Blackwater":
//                                References.References.Blackwater.setConnections(makeConnections(connections));
//                                break;
//                            case "Kings_Landing":
//                                References.References.Kings_Landing.setConnections(makeConnections(connections));
//                                break;
//                            case "Dragonstone":
//                                References.References.Dragonstone.setConnections(makeConnections(connections));
//                                break;
//                            case "Highgarden":
//                                References.References.Highgarden.setConnections(makeConnections(connections));
//                                break;
//                            case "The_Reach":
//                                References.References.The_Reach.setConnections(makeConnections(connections));
//                                break;
//                            case "Kingswood":
//                                References.References.Kingswood.setConnections(makeConnections(connections));
//                                break;
//                            case "Storms_End":
//                                References.References.Storms_End.setConnections(makeConnections(connections));
//                                break;
//                            case "The_Boneway":
//                                References.References.The_Boneway.setConnections(makeConnections(connections));
//                                break;
//                            case "Dornish_Marches":
//                                References.References.Dornish_Marches.setConnections(makeConnections(connections));
//                                break;
//                            case "Oldtown":
//                                References.References.Oldtown.setConnections(makeConnections(connections));
//                                break;
//                            case "Three_Towers":
//                                References.References.Three_Towers.setConnections(makeConnections(connections));
//                                break;
//                            case "Princes_Pass":
//                                References.References.Princes_Pass.setConnections(makeConnections(connections));
//                                break;
//                            case "Yronwood":
//                                References.References.Yronwood.setConnections(makeConnections(connections));
//                                break;
//                            case "Sunspear":
//                                References.References.Sunspear.setConnections(makeConnections(connections));
//                                break;
//                            case "Starfall":
//                                References.References.Starfall.setConnections(makeConnections(connections));
//                                break;
//                            case "Salt_Shore":
//                                References.References.Salt_Shore.setConnections(makeConnections(connections));
//                                break;
//                            case "The_Arbor":
//                                References.References.The_Arbor.setConnections(makeConnections(connections));
//                                break;
//
//                            default:
//
//                                break;
//
//                        }
//                    }
//
//                }
//            }
//
//        }
//    }

}
