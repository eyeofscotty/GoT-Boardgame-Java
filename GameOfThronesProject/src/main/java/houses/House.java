package houses;

import tokens.OrderToken;

import java.util.ArrayList;

//Make this an abstract class???? just to clean up getters/setters
public interface House {

    String getName();

    int getSupply();

    void setSupply(int supply);

    int getPowerTokens();

    void setPowerTokens(int powerTokens);

    int getNumStrongholds();

    void setNumStrongholds(int numStrongholds);

    int getNumCastles();

    void setNumCastles(int numCastles);

    int getRavenTrack();

    void setRavenTrack(int ravenTrack);

    int getIronThroneTrack();

    void setIronThroneTrack(int ironThroneTrack);

    int getSwordTrack();

    void setSwordTrack(int swordTrack);

    int getNumStars();

    //possibly have to adjust here if want to configure for less than 6 players
    void setNumStars(int numStars);

    void startingPosition();

    int totalCastlesAndStrongholds();

    ArrayList<OrderToken> getAvailableOrderTokens();

    void setAvailableOrderTokens(ArrayList<OrderToken> availableOrderTokens);

    ArrayList<OrderToken> getAllOrderTokens();

    void setAllOrderTokens(ArrayList<OrderToken> allOrderTokens);


}
