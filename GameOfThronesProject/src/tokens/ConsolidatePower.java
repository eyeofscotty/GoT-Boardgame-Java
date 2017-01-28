package tokens;

/**
 * Created by Scott on 1/23/2017.
 */
public class ConsolidatePower implements OrderToken {


    private boolean star;
    private boolean isAvailable;

    public ConsolidatePower(boolean star, boolean isAvailable) {
        this.isAvailable = isAvailable;
        this.star = star;
    }

//    public boolean Equals(OrderToken orderToken) {
//        boolean returnboolean = false;
//        if (orderToken is ConsolidatePower)
//        {
//            ConsolidatePower consolidatePower = (ConsolidatePower) orderToken;
//            if (consolidatePower.getStar() == this.getStar()) {
//                returnboolean = true;
//            }
//        }
//        return returnboolean;
//    }


    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean getStar() {
        return this.star;
    }

    public String toString() {
        String str = "  - ";
        if (star) {
            str += "CP*";
        } else {
            str += "CP";
        }
        return str;
    }

}
