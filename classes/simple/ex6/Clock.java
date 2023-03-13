package classes.simple.ex6;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public void setHours(int hours) {
        if (hours < 24 && hours > 0)
            this.hours = hours;
        else
            this.hours = 0;
    }

    public void setMinutes(int minutes) {
        if (minutes < 60 && minutes > 0)
            this.minutes = minutes;
        else
            this.minutes = 0;
    }

    public void setSeconds(int seconds) {
        if (seconds < 60 && seconds > 0)
            this.seconds = seconds;
        else
            this.seconds = 0;
    }

    public void setTime(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public Clock(int hours, int minutes, int seconds) {
        setTime(hours, minutes, seconds);
    }

    public String getTime() {
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
