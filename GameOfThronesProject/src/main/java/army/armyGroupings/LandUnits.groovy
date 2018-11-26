package army.armyGroupings

import References.ReferenceConstant
import army.Army
import army.Infantry
import army.Knight
import army.SiegeEngine

class LandUnits implements UnitGroupings{
    Map<String, List<Army>> landUnits = new HashMap<>()

    LandUnits(){
        List<Infantry> infantryList = new ArrayList<>()
        List<Knight> knightList = new ArrayList<>()
        List<SiegeEngine> siegeEngine = new ArrayList<>()
        landUnits.put(ReferenceConstant.KNIGHT, knightList)
        landUnits.put(ReferenceConstant.INFANTRY, infantryList)
        landUnits.put(ReferenceConstant.SIEGE_ENGINE, siegeEngine)
    }

    public Map<String, List<Army>> getArmyGrouping(){
        return this.landUnits
    }

    @Override
    int getTotalDefense() {
        int totalDefense = 0
        for(Army a: landUnits.values()){
            if(!a.getRouted()){
                totalDefense += a.getDefensePower()
            }
        }
        return totalDefense
    }

    @Override
    int getTotalAttack() {
        int totalAttack = 0
        for(Army a: landUnits.values()){
            if(!a.getRouted()){
                totalAttack += a.getAttackPower()
            }
        }
        return totalAttack
    }
}
