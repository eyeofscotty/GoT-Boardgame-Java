package houses;

import References.References;
import tokens.OrderToken;

import java.util.ArrayList;

/**
 * Created by Scott on 1/23/2017.
 */
public class HouseMartell implements House {
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
    //Store cards in a resource file later
    private ArrayList<String> houseCardsInHand;
    private ArrayList<String> discardedHouseCards;
    ArrayList<OrderToken> availableOrderTokens;
    ArrayList<OrderToken> allOrderTokens;

    public HouseMartell(String name, int numSupply, int numPowerTokens, int numCastles, int numStrongholds, int ravenTrack, int ironThroneTrack, int swordTrack, int numStars){
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

    public HouseMartell() {
        this.name = "Martell";
        this.numSupply = 2;
        this.numPowerTokens = 5;
        this.numCastles = 0;
        this.numStrongholds = 1;
        this.totalNumCastlesAndStrongHolds = 1;
        this.ravenTrack = 3;
        this.ironThroneTrack = 4;
        this.swordTrack = 3;
        this.numStars = 2;
        this.houseCardsInHand = new ArrayList<String>();
//        this.houseCardsInHand.add(References.References.THE_RED_VIPER);
//        this.houseCardsInHand.add(References.References.AREO_HOTAH);
//        this.houseCardsInHand.add(References.References.OBARA_SAND);
//        this.houseCardsInHand.add(References.References.DARKSTAR);
//        this.houseCardsInHand.add(References.References.NYMERIA_SAND);
//        this.houseCardsInHand.add(References.References.ARIANNE_MARTELL);
//        this.houseCardsInHand.add(References.References.DORAN_MARTELL);
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
