package houses;

import References.References;
import tokens.OrderToken;

import java.util.ArrayList;

/**
 * Created by Scott on 1/23/2017.
 */
public class HouseBaratheon implements House{

    private int numSupply;
    private int numPowerTokens;
    private int numCastles;
    private int numStrongholds;
    private int ravenTrack;
    private int ironThroneTrack;
    private int swordTrack;
    private int numStars;
    private int totalNumCastlesAndStrongHolds;
    private String name;
    //Store cards in a resource file later?
    private ArrayList<String> houseCardsInHand;
    private ArrayList<String> discardedHouseCards;
    ArrayList<OrderToken> availableOrderTokens;
    ArrayList<OrderToken> allOrderTokens;

    public HouseBaratheon(String name, int numSupply, int numPowerTokens, int numCastles, int numStrongholds, int ravenTrack, int ironThroneTrack, int swordTrack, int numStars){
        this.name = name;
        this.numSupply = numSupply;
        this.numPowerTokens = numPowerTokens;
        this.numCastles = numCastles;
        this.numStrongholds = numStrongholds;
        this.ravenTrack = ravenTrack;
        this.ironThroneTrack = ironThroneTrack;
        this.swordTrack = swordTrack;
        this.numStars = numStars;
    }

    public HouseBaratheon() {
        this.name = "Baratheon";
        this.numSupply = 2;
        this.numPowerTokens = 5;
        this.numCastles = 0;
        this.numStrongholds = 1;
        this.totalNumCastlesAndStrongHolds = 1;
        this.ravenTrack = 4;
        this.ironThroneTrack = 1;
        this.swordTrack = 5;
        this.numStars = 1;
        this.houseCardsInHand = new ArrayList<String>();
//        this.houseCardsInHand.add(References.References.STANNIS_BARATHEON);
//        this.houseCardsInHand.add(References.References.RENLY_BARATHEON);
//        this.houseCardsInHand.add(References.References.SER_DAVOS_SEAWORTH);
//        this.houseCardsInHand.add(References.References.BRIENNE_OF_TARTH);
//        this.houseCardsInHand.add(References.References.SALLADHOR_SAAN);
//        this.houseCardsInHand.add(References.References.MELISANDRE);
//        this.houseCardsInHand.add(References.References.PATCH_FACE);
        discardedHouseCards = new ArrayList<String>();

    }

    public ArrayList<OrderToken> getAllOrderTokens() {
        return this.allOrderTokens;
    }

    public void setAllOrderTokens(ArrayList<OrderToken> allOrderTokens) {
        this.allOrderTokens = allOrderTokens;
    }

    public ArrayList<OrderToken> getAvailableOrderTokens() {
        return this.availableOrderTokens;
    }

    public void setAvailableOrderTokens(ArrayList<OrderToken> availableOrderTokens) {
        this.availableOrderTokens = availableOrderTokens;
    }

    public String getName() {
        return this.name;
    }

    public int getSupply() {
        return this.numSupply;
    }

    public void setSupply(int numSupply) {
        this.numSupply = numSupply;
    }

    public int getPowerTokens() {
        return this.numPowerTokens;
    }

    public void setPowerTokens(int numPowerTokens) {
        this.numPowerTokens = numPowerTokens;
    }

    public int getNumStrongholds() {
        return this.numStrongholds;
    }

    public void setNumStrongholds(int numStrongholds) {
        this.numStrongholds = numStrongholds;
    }

    public int getNumCastles() {
        return this.numCastles;
    }

    public void setNumCastles(int numCastles) {
        this.numCastles = numCastles;
    }

    public int getRavenTrack() {
        return this.ravenTrack;
    }

    public void setRavenTrack(int ravenTrack) {
        this.ravenTrack = ravenTrack;
    }

    public int getIronThroneTrack() {
        return this.ironThroneTrack;
    }

    public void setIronThroneTrack(int ironThroneTrack) {
        this.ironThroneTrack = ironThroneTrack;
    }

    public int getSwordTrack() {
        return this.swordTrack;
    }

    public void setSwordTrack(int swordTrack) {
        this.swordTrack = swordTrack;
    }

    public int getNumStars() {
        return this.numStars;
    }

    public void setNumStars(int numStars) {
        this.numStars = numStars;
    }

    public void startingPosition() {

    }

    public int totalCastlesAndStrongholds() {
        int totalNumCastlesAndStrongholds = this.numCastles + this.numStrongholds;
        return totalNumCastlesAndStrongholds;
    }

}
