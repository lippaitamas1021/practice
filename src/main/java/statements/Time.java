package statements;

public class Time {
    private int hour;
    private int min;
    private int sec;

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int getInMinutes() {
        return hour * 60 + min;
    }

    public int getInSeconds() {
        return (hour * 60 * 60) + (min * 60) + sec;
    }

    public boolean earlierThan(Time time) {
        if (this.getInSeconds() < time.getInSeconds()) {
            return true;
        } else {
            return false;}
        }

    @Override
    public String toString() {
        return "időpont " + hour + ":" + min + ":" + sec;
    }
}
