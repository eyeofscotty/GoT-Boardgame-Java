package tokens;

/**
 * Created by Scott on 1/20/2018.
 */
public abstract class OrderToken {

    private boolean star;
    private boolean isAvailable;

    OrderToken(){}

    public OrderToken(boolean star, boolean isAvailable){
        this.star = star;
        this.isAvailable = isAvailable;
    }

    public boolean getStar() {
        return this.star;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
