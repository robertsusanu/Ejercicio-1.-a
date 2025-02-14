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
        this.second += 1;
        if (this.second > 59) {
            this.second = 0;
            this.minute ++;
        }if(minute > 59) {
            this.minute = 0;
            this.hour ++;
        }if(hour > 23) {
            this.hour = 0;
        }
        return this;
    }

    public Time previousSecond() {
        this.second -= 1;
        if (this.second < 0) {
            this.second = 59;
            this.minute -= 1;
        }if(minute < 0) {
            this.minute = 59;
            this.hour -= 1;
        }if(hour < 0) {
            this.hour = 23;
        }
        return this;
    }
}
// no hace bien el next y previous second
