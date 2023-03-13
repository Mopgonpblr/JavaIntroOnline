package classes.aggrComp.ex3;

public class Country {
    private String name;
    private Region[] regions;

    public Country(Region[] regions) {
        this.regions = regions;
    }

    public Country() {
        this.regions = new Region[0];
    }

    public void addRegion(Region region) {
        Region[] temp = new Region[regions.length + 1];
        System.arraycopy(regions, 0, temp, 0, regions.length);
        temp[regions.length] = region;
        regions = temp;
    }

    public void showCapital() {
        for (Region region : regions)
            for (District district : region.getDistricts())
                for (Town town : district.getTowns())
                    if (town.isCapital())
                        System.out.println(town + " is the capital");
    }

    public void showRegionNumber() {
        System.out.println("The number of regions: " + regions.length);
    }

    public void showArea() {
        int area = 0;
        for (Region region : regions)
            for (District district : region.getDistricts())
                area += district.getArea();
        System.out.println("Total area: " + area);
    }

    public void showRegionCenters() {
        System.out.println("Region centers:");
        for (Region region : regions)
            for (District district : region.getDistricts())
                for (Town town : district.getTowns())
                    if (town.isRegionCenter())
                        System.out.println(town);
    }

}
