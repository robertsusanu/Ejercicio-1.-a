package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoA;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    public Time nextSecond() {
        if (hour == 24) {
            hour = 0;
        } else if (minute == 60){
            hour += 1;
            minute = 0;
        }else if (second == 60){
                minute += 1;
                second = 0;
            } else{
            second += 1;
        }
        return new Time(hour, minute, second);
    }

    public Time previousSecond() {
        if (hour == -1) {
            hour = 23;
        } else if (minute == -1) {
            minute = 59;
            hour -= 1;
        } else if (second == -1) {
            second = 59;
            minute -= 1;
        }else{
            second -= 1;
        }return  new Time(hour, minute, second);
    }
}
// no hace bien el next y previous second
