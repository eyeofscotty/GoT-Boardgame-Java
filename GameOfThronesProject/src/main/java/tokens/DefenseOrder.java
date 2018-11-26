//package tokens;
//
///**
// * Created by Scott on 1/23/2017.
// */
//public class DefenseOrder implements OrderToken {
//
//
//    private boolean star;
//    private boolean isAvailable;
//
//    public DefenseOrder(boolean star, boolean isAvailable) {
//        this.isAvailable = isAvailable;
//        this.star = star;
//    }
//
////        public boolean Equals(OrderToken orderToken)
////        {
////            boolean returnboolean = false;
////            if (orderToken is DefenseOrder)
////            {
////                DefenseOrder defenseOrder = (DefenseOrder)orderToken;
////                if (defenseOrder.getStar() == this.getStar())
////                {
////                    returnboolean = true;
////                }
////            }
////
////            return returnboolean;
////        }
//
//    public boolean getIsAvailable() {
//        return this.isAvailable;
//    }
//
//    public void setIsAvailable(boolean isAvailable) {
//        this.isAvailable = isAvailable;
//    }
//
//    public boolean getStar() {
//        return this.star;
//    }
//
//    public String toString() {
//        String str = "  - ";
//        if (star) {
//            str += "DO*+2";
//        } else {
//            str += "Do+1";
//        }
//        return str;
//    }
//
//
//}
