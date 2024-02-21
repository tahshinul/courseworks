package clockdemo;
public class Clock {
    int hour ;
    int minute;
    int second;

    public Clock() {
    }

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Clock(int x) {
        hour = x/3600;
        int y = x%3600;
        minute = y/60;
        second = y%60;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    
    public String toString() {
        
    }
    
}
