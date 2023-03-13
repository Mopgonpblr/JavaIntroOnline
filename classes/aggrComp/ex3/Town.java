package classes.aggrComp.ex3;

public class Town {
    private String name;
    private boolean isCapital;
    private boolean isRegionCenter;
    private boolean isDistrictCenter;

    public Town(String name, boolean isCapital, boolean isRegionCenter, boolean isDistrictCenter) {
        this.name = name;
        this.isCapital = isCapital;
        this.isRegionCenter = isRegionCenter;
        this.isDistrictCenter = isDistrictCenter;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRegionCenter() {
        return isRegionCenter;
    }

    public void setRegionCenter(boolean regionCenter) {
        isRegionCenter = regionCenter;
    }

    public String toString() {
        return this.name;
    }
}
