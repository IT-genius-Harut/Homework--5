package taskThree;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {}

    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public boolean checkTime(){
        if (hours < 0 || hours > 24){
            return false;
        } else if (minutes < 0 || minutes > 60) {
            return false;
        } else if (seconds < 0 || seconds > 60) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Hour(s) is: " + hours + " minute(s) is: " + minutes + " second(s) is: " + seconds;
    }
}
