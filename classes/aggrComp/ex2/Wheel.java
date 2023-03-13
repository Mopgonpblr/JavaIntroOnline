package classes.aggrComp.ex2;

public class Wheel {
    private boolean isOkay;

    public Wheel() {
        this.isOkay = true;
    }

    public boolean isOkay() {
        return isOkay;
    }

    public void setOkay(boolean okay) {
        isOkay = okay;
    }

    @Override
    public String toString() {
        if (isOkay)
            return "The wheel is okay";
        else
            return "The wheel needs the replacement";
    }
}
