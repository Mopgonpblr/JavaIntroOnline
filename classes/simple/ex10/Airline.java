package classes.simple.ex10;

public class Airline {
    private String destinationPoint;
    private String flightNumber;
    private String type;
    private String time;
    private String days;


    public Airline(String destinationPoint, String flightNumber, String type, String time, String days) {
        this.destinationPoint = destinationPoint;
        this.flightNumber = flightNumber;
        this.type = type;
        this.time = time;
        this.days = days;
    }

    public String toString() {
        return this.destinationPoint + " | " + this.flightNumber + " | " + this.type + " | " + this.time + " | " + this.days;
    }

    public String getDestinationPoint() {
        return destinationPoint;
    }

    public void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }
}
