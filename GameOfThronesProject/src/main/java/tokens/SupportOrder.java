package tokens;

/**
 * Created by Scott on 1/23/2017.
 */
public class SupportOrder extends OrderToken {

    boolean star;
    boolean isAvailable;

    SupportOrder(){

    }
//    public SupportOrder(boolean star, boolean isAvailable) {
//        this.isAvailable = isAvailable;
//        this.star = star;
//    }

//        public boolean Equals(OrderToken orderToken)
//        {
//            boolean returnboolean = false;
//            if (orderToken is SupportOrder)
//            {
//                SupportOrder supportOrder = (SupportOrder)orderToken;
//                if (this.getStar() == supportOrder.getStar())
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
            str += "SO*+1";
        } else {
            str += "SO";
        }
        return str;
    }

}
