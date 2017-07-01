package connections;

import References.References;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Scott on 1/23/2017.
 */
public class SeaToLandConnections {
    
//
//    public ArrayList<String> allSeas(String textFile) throws IOException {
//        ArrayList<String> allSeas = new ArrayList<String>();
//        File file = new File(textFile);
//        BufferedReader reader = new BufferedReader(new FileReader(file));
//        String line;
//        while ((line = reader.readLine()) != null) {
//            String[] splitLine = line.split(":");
//            allSeas.add(splitLine[0]);
//        }
//
//        return allSeas;
//    }
//
//
//    private ArrayList<String> makeConnections(String[] array) {
//        ArrayList<String> ArrayList = new ArrayList<String>();
//        for(String s: array)
//        {
//            ArrayList.add(s.trim());
//        }
//        return ArrayList;
//    }
//
//    public void createSeaToLandConnections(String textFile) throws IOException {
//        File file = new File(textFile);
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader(file));
//            String line;
//            while ((line = reader.readLine()) != null) {
//                String[] splitLine = line.split(":");
//                String name = splitLine[0];
//                String[] connections = splitLine[1].split(",");
//                switch (name) {
//                    //creates all the land territories
//                    case "The_Shivering_Sea":
//                        References.References.The_Shivering_Sea.setLandConnections(makeConnections(connections));
//                        break;
//                    case "The_Narrow_Sea":
//                        References.References.The_Narrow_Sea.setLandConnections(makeConnections(connections));
//                        break;
//                    case "Shipbreaker_Bay":
//                        References.References.Shipbreaker_Bay.setLandConnections(makeConnections(connections));
//                        break;
//                    case "Blackwater_Bay":
//                        References.References.Blackwater_Bay.setLandConnections(makeConnections(connections));
//                        break;
//                    case "Sea_Of_Dorne":
//                        References.References.Sea_Of_Dorne.setLandConnections(makeConnections(connections));
//                        break;
//                    case "East_Summer_Sea":
//                        References.References.East_Summer_Sea.setLandConnections(makeConnections(connections));
//                        break;
//                    case "West_Summer_Sea":
//                        References.References.West_Summer_Sea.setLandConnections(makeConnections(connections));
//                        break;
//                    case "Redwyne_Straights":
//                        References.References.Redwyne_Straights.setLandConnections(makeConnections(connections));
//                        break;
//                    case "Sunset_Sea":
//                        References.References.Sunset_Sea.setLandConnections(makeConnections(connections));
//                        break;
//                    case "The_Golden_Sound":
//                        References.References.The_Golden_Sound.setLandConnections(makeConnections(connections));
//                        break;
//                    case "Ironmans_Bay":
//                        References.References.Ironmans_Bay.setLandConnections(makeConnections(connections));
//                        break;
//                    case "Bay_Of_Ice":
//                        References.References.Bay_Of_Ice.setLandConnections(makeConnections(connections));
//                        break;
//                    default:
//
//                        break;
//                }
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//    }
}


