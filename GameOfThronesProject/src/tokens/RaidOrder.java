package tokens;

/**
 * Created by Scott on 1/23/2017.
 */
public class RaidOrder implements OrderToken {

    private boolean star;
    private boolean isAvailable;

    public RaidOrder(boolean star, boolean isAvailable) {
        this.isAvailable = isAvailable;
        this.star = star;
    }

//        public boolean Equals(OrderToken orderToken)
//        {
//            boolean returnboolean = false;
//            if (orderToken is RaidOrder)
//            {
//                RaidOrder raidOrder = (RaidOrder)orderToken;
//                if (raidOrder.getStar() == this.getStar())
//                {
//                    returnboolean = true;
//                }
//            }
//            return returnboolean;
//        }

    public boolean getStar() {
        return this.star;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


    public String toString() {
        String str = "  - ";
        if (star) {
            str += "RO*";
        } else {
            str += "RO";
        }
        return str;
    }

}
