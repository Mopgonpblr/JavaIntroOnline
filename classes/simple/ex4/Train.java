package classes.simple.ex4;

public class Train {
    private String destination;
    private int number;
    private String time;

    public Train(String destination, int number, String time) {
        this.destination = destination;
        this.number = number;
        this.time = time;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return number;
    }

    public String getTime() {
        return time;
    }
}
