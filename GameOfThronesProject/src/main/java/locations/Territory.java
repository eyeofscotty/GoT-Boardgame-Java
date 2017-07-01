package locations;

import houses.House;
import tokens.OrderToken;

/**
 * Created by Scott on 1/23/2017.
 */
public interface Territory {

    House getHouseOccupied();

    void setHouseOccupied(House houseOccupied);

    String getName();

    boolean getIsOccupied();

    void setOrderToken(OrderToken orderToken);

    OrderToken getOrderToken();

}
