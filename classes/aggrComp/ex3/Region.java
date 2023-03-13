package classes.aggrComp.ex3;

public class Region {
    private District[] districts;

    public Region(District[] districts) {
        this.districts = districts;
    }

    public Region() {
        this.districts = new District[0];
    }

    public void addDistrict(District district) {
        District[] temp = new District[districts.length + 1];
        System.arraycopy(districts, 0, temp, 0, districts.length);
        temp[districts.length] = district;
        districts = temp;
    }

    public District[] getDistricts() {
        return districts;
    }
}
