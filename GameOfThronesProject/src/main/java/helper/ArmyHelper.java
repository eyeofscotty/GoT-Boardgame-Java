package helper;

import army.Infantry;
import army.Knight;
import army.Ship;
import army.SiegeEngine;

import java.util.ArrayList;
import java.util.List;

public class ArmyHelper {

    public ArmyHelper(){}


    //only for initalization
    public List<Infantry> initializeInfantry(int numAddedInfantry){
        List<Infantry> addedInfantry = new ArrayList<Infantry>();
        for(int i = 0; i < numAddedInfantry; i ++){
            addedInfantry.add(new Infantry());
        }
        return addedInfantry;
    }

    //only for initalization
    public List<Knight> initalizeKnight(int numAddedKnight){
        List<Knight> addedKnight = new ArrayList<Knight>();
        for(int i = 0; i < numAddedKnight; i ++){
            addedKnight.add(new Knight());
        }
        return addedKnight;
    }

    //only for initalization
    public List<SiegeEngine> initializeSiege(int numAddedSiege){
        List<SiegeEngine> addedSiege = new ArrayList<SiegeEngine>();
        for(int i = 0; i < numAddedSiege; i ++){
            addedSiege.add(new SiegeEngine());
        }
        return addedSiege;
    }

    //only for initalization
    public List<Ship> initializeShip(int numAddedShip){
        List<Ship> addedShip = new ArrayList<Ship>();
        for(int i = 0; i < numAddedShip; i ++){
            addedShip.add(new Ship());
        }
        return addedShip;
    }

}
