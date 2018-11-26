package combat.impl;

import army.armyGroupings.UnitGroupings;
import locations.AbstractTerritory;
import locations.LandTerritoryImpl;
import tokens.SupportOrder;

import java.util.List;

public class DetermineCombatImpl {

    public int determineDefensePower(UnitGroupings defenseGrouping) {
        return defenseGrouping.getTotalDefense();
    }

    public int determineAttakPower(UnitGroupings attackGrouping) {
        return attackGrouping.getTotalAttack();
    }

    public int determineDefenseSupportPower(UnitGroupings defenseGrouping, AbstractTerritory defenseTerritory) {
        List<LandTerritoryImpl> territoryListConnections = defenseTerritory.getLandConnections();
        int defenseSupportPower = 0;
        for (LandTerritoryImpl landTerritory : territoryListConnections) {
            if (landTerritory.getOrderToken() instanceof SupportOrder) {
                defenseSupportPower += defenseGrouping.getTotalDefense();
            }
        }
        return defenseSupportPower;
    }

    public int determineAttackSupportPower(){
        return 0;
    }

    public void initateCombat(UnitGroupings attackGrouping, UnitGroupings defenseGrouping, AbstractTerritory attackTerritory, AbstractTerritory defenseTerritory) {
        int baseAttackPower = determineAttakPower(attackGrouping);
        int baseDefense = determineDefensePower(defenseGrouping);
        //Probs add something to determine if peeps want to support
        int attackSupport = determineDefenseSupportPower(defenseGrouping, defenseTerritory);
        int defenseSupport = determineAttackSupportPower();
        //do house cards combat????
    }

}
