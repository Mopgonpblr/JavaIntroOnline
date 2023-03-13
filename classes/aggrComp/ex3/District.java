package classes.aggrComp.ex3;

public class District {
    private Town[] towns;
    private double area;

    public District(Town[] towns, double area) {
        this.towns = towns;
        this.area = area;
    }

    public District() {
        this.towns = new Town[0];
        this.area = 0;
    }

    public void addTown(Town town) {
        Town[] temp = new Town[towns.length + 1];
        System.arraycopy(towns, 0, temp, 0, towns.length);
        temp[towns.length] = town;
        towns = temp;
    }

    public Town[] getTowns() {
        return towns;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
