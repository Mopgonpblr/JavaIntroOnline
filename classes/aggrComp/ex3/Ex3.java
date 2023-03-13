/**
 * 3. Создать объект класса Государство,
 * используя классы Область, Район,
 * Город.
 * Методы: вывести на консоль столицу,
 * количество областей, площадь,
 * областные центры.
 */
package classes.aggrComp.ex3;

public class Ex3 {
    public static void main(String[] args) {
        Country country = Belarus();
        country.showCapital();
        country.showRegionNumber();
        country.showArea();
        country.showRegionCenters();
    }
    static Country Belarus(){
        Town town1 = new Town("Bierascie", false, true, true);
        Town town2 = new Town("Viciebsk", false, true, true);
        Town town3 = new Town("Homiel", false, true, true);
        Town town4 = new Town("Horadnia", false, true, true);
        Town town5 = new Town("Miensk", true, true, true);
        Town town6 = new Town("Mahiliou", false, true, true);

        Town st1 = new Town("Barysau", false, false, true);

        District d1 = new District();
        d1.addTown(town1);
        d1.setArea(1544);
        District d2 = new District();
        d2.addTown(town2);
        d2.setArea(2737);
        District d3 = new District();
        d3.addTown(town3);
        d3.setArea(1955);
        District d4 = new District();
        d4.addTown(town4);
        d4.setArea(2593);
        District d5 = new District();
        d5.addTown(town5);
        d5.setArea(1902);
        District d6 = new District();
        d6.addTown(town6);
        d6.setArea(1895);

        District sd1 = new District();
        sd1.addTown(st1);
        sd1.setArea(2987);

        Region r1 = new Region();
        r1.addDistrict(d1);
        Region r2 = new Region();
        r2.addDistrict(d2);
        Region r3 = new Region();
        r3.addDistrict(d3);
        Region r4 = new Region();
        r4.addDistrict(d4);
        Region r5 = new Region();
        r5.addDistrict(d5);
        r5.addDistrict(sd1);
        Region r6 = new Region();
        r6.addDistrict(d6);

        Country country = new Country();
        country.addRegion(r1);
        country.addRegion(r2);
        country.addRegion(r3);
        country.addRegion(r4);
        country.addRegion(r5);
        country.addRegion(r6);

        return country;
    }
}







