package army.armyGroupings

import army.Army

interface UnitGroupings {

    Map<String, List<Army>> getArmyGrouping()

    int getTotalDefense()

    int getTotalAttack()

}