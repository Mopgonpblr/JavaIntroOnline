package classes.simple.ex10;

public class Airport {

    private Airline[] flights;

    Airport(Airline[] flights) {
        this.flights = flights;
    }


    public void selectDestinationPoint(String destinationPoint) {
        System.out.println("Flies to " + destinationPoint);
        for (Airline flight : flights) {
            if (flight.getDestinationPoint().equals(destinationPoint)) {
                System.out.println(flight);
            }
        }
    }

    public void selectDay(String day) {
        System.out.println("Flies on " + day);
        for (Airline flight : flights) {
            if (flight.getDays().contains(day)) {
                System.out.println(flight);
            }
        }
    }

    public void selectTime(String day, String time) {
        System.out.println("Flies on " + day + " after " + time);
        for (Airline flight : flights) {
            if (flight.getDays().contains(day) && flight.getTime().compareTo(time) > 0) {
                System.out.println(flight);
            }
        }
    }
}
