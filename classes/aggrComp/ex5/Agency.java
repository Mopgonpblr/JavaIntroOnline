package classes.aggrComp.ex5;

public class Agency {
    private Trip[] trips;
    private String name;

    public Agency() {
        this.name = "Agency";
        this.trips = new Trip[5];
        trips[0] = new Trip("Berlin", Types.EXCURSION);
        trips[1] = new Trip("Sri Lanka", Types.REST);
        trips[2] = new Trip("Krakow", Types.HEALING);
        trips[3] = new Trip("Amsterdam", Types.SHOPPING);
        trips[4] = new Trip("Egypt", Types.CRUISE);
    }

    public Trip[] getTrips() {
        return trips;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sortByDestination() {
        for (int i = 1; i < trips.length; )
            if (trips[i].getDestination().compareTo(trips[i - 1].getDestination()) < 0) {
                Trip temp = trips[i];
                trips[i] = trips[i - 1];
                trips[i - 1] = temp;
                i = 1;
            } else i++;
    }

    public void sortByType() {
        for (int i = 1; i < trips.length; )
            if (trips[i].getType().compareTo(trips[i - 1].getType()) < 0) {
                Trip temp = trips[i];
                trips[i] = trips[i - 1];
                trips[i - 1] = temp;
                i = 1;
            } else i++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Trip trip : trips)
            sb.append(trip).append("\n");
        return sb.toString();
    }
}
