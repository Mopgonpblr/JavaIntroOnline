/**
 * 5. Туристические путевки. Сформировать
 * набор предложений клиенту по выбору
 * туристической путевки различного типа
 * (отдых, экскурсии, лечение, шопинг,
 * круиз и т. д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта,
 * питания и числа дней. Реализовать выбор
 * и сортировку путевок.
 */
package classes.aggrComp.ex5;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Agency agency = new Agency();

        System.out.println(agency);

        agency.sortByDestination();
        System.out.println("Sort by destination");
        System.out.println(agency);

        agency.sortByType();
        System.out.println("Sort by type");
        System.out.println(agency);


        Trip trip;
        Scanner scan = new Scanner(System.in);
        System.out.print("Select the trip: ");
        trip = agency.getTrips()[scan.nextInt() - 1];
        System.out.println(Arrays.toString(Eating.values()));
        System.out.print("Select the eating: ");
        trip.setEating(Eating.values()[scan.nextInt() - 1]);
        System.out.println(Arrays.toString(Transport.values()));
        System.out.print("Select the transport: ");
        trip.setTransport(Transport.values()[scan.nextInt() - 1]);
        System.out.print("Days: ");
        trip.setDays(scan.nextInt());

        System.out.println(trip + " | " + trip.getEating().name() + " | " + trip.getTransport().name() + " | " + trip.getDays() + " days");
    }
}

