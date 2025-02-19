package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoB;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }
    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }
    public void setBeginX(int beginX) {
        this.begin.setX(beginX);
    }

    public int getBeginY() {
        return begin.getY();
    }
    public void setBeginY(int beginY) {
        this.begin.setY(beginY);
    }

    public int getEndX() {
        return end.getX();
    }
    public void setEndX(int endX) {
        this.end.setX(endX);
    }

    public int getEndY() {
        return end.getY();
    }
    public void setEndY(int endY) {
        this.end.setY(endY);
    }

    public int[] getBeginXY(){
        int[] xy = new int[2];
        xy[0] = begin.getX();
        xy[1] = begin.getY();
        return xy;
    }
    public void setBeginXY(int x, int y){
        this.begin.setX(x);
        this.begin.setY(y);
    }

    public int[] getEndXY(){
        int[] xy = new int[2];
        xy[0] = end.getX();
        xy[1] = end.getY();
        return xy;
    }
    public void setEndXY(int x, int y){
        this.end.setX(x);
        this.end.setY(y);
    }

    public double getLength(MyLine ln){
        return begin.distance(end);
    }

    public double getGradient(){
        return Math.atan2(end.getY()-begin.getY(), end.getX()-begin.getX());
    }

    public String toString(){
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }
}
