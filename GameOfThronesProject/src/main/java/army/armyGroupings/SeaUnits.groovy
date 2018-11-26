package army.armyGroupings

import References.ReferenceConstant
import army.Army
import army.Ship

class SeaUnits implements UnitGroupings {
    Map<String, List<Army>> seaUnits = new HashMap<>()

    SeaUnits() {
        List<Ship> shipList = new ArrayList<>()
        seaUnits.put(ReferenceConstant.SHIP, shipList)
    }

    public Map<String, List<Army>> getArmyGrouping() {
        return this.seaUnits
    }

    @Override
    int getTotalDefense() {
        int totalDefense = 0
        for(Army a: seaUnits.values()){
            if(!a.getRouted()){
                totalDefense += a.getDefensePower()
            }
        }
        return totalDefense
    }

    @Override
    int getTotalAttack() {
        int totalAttack = 0
        for(Army a: seaUnits.values()){
            if(!a.getRouted()){
                totalAttack += a.getAttackPower()
            }
        }
        return totalAttack
    }
}
