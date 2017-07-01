package tokens;

/**
 * Created by Scott on 1/23/2017.
 */
public class MarchOrder implements OrderToken {

    private boolean star, zero, neg, isAvailable;

    public MarchOrder(boolean star, boolean zero, boolean neg, boolean isAvailable) {
        this.isAvailable = isAvailable;
        this.star = star;
        this.zero = zero;
        this.neg = neg;
    }

//        public boolean Equals(OrderToken orderToken)
//        {
//            boolean returnboolean = false;
//            if (orderToken is MarchOrder)
//            {
//                MarchOrder marchOrder = (MarchOrder)orderToken;
//                if (marchOrder.getStar() == this.getStar() && marchOrder.getNegToken() == this.getNegToken() && marchOrder.getZeroToken() == this.getZeroToken())
//                {
//                    returnboolean = true;
//                }
//            }
//            return returnboolean;
//        }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean getStar() {
        return this.star;
    }

    public boolean getZeroToken() {
        return this.zero;
    }

    public boolean getNegToken() {
        return this.neg;
    }

    public String toString() {
        String str = "  - ";
        if (star) {
            str += "MO*+1";
        } else if (zero) {
            str += "MO+0";
        } else {
            str += "MO-1";
        }
        return str;
    }

}
