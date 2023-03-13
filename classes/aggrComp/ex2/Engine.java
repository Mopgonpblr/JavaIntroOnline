package classes.aggrComp.ex2;

public class Engine {
    private boolean isOkay;
    private double fuel;
    private int maxFuel;
    private int milesPerGallon;

    public Engine(int maxFuel, int milesPerGallon) {
        this.maxFuel = maxFuel;
        this.fuel = maxFuel;
        this.milesPerGallon = milesPerGallon;
        this.isOkay = true;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public boolean isOkay() {
        return isOkay;
    }

    public void setOkay(boolean okay) {
        isOkay = okay;
    }

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fuel: ").append(fuel).append("\n");
        sb.append("Max fuel: ").append(maxFuel).append("\n");
        sb.append("Miles per gallon: ").append(milesPerGallon).append("\n");
        sb.append("Status:");
        if (isOkay()) {
            sb.append("fine");
        } else
            sb.append("needs to be repaired");
        return sb.toString();
    }
}
