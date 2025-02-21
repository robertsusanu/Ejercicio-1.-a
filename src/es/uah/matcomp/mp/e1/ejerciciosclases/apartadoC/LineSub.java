package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoC;

import es.uah.matcomp.mp.e1.ejerciciosclases.apartadoB.MyLine;

public class LineSub extends Point{
    // A line needs two points: begin and end.
// The start point is inherited from its superclass Point.
// Private variables
    private Point begin;
    private Point end; // Ending point
    // Constructors
    public LineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY); // construct the start Point
        this.end = new Point(endX, endY); // construct the end Point
    }
    public LineSub (Point begin, Point end) { // caller to construct the Points
        super(begin.getX(), begin.getY()); // need to reconstruct the start Point
        this.end = end;
    }
    // Public methods
// Inherits methods getX() and getY() from superclass Point
    @Override
    public String toString() {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }
    
    public Point getBegin() {
        return begin;
    }
    public Point getEnd() {
        return end;
    }
    public void setBegin(Point begin) {
        this.begin = begin;
    }
    
    public void setEnd(Point end) {
        this.end = end;
    }
    public float getBeginX() {
        return begin.getX();
    }
    public float getBeginY() {
        return begin.getY();
    }
    public float getEndX() {
        return end.getX();
    }
    public float getEndY() {
        return end.getY();
    }
    public void setBeginX(int beginX) {
        this.begin.setX(beginX);
    }

    public void setBeginY(int beginY) {
        this.begin.setY(beginY);
    }
    public void setBeginXY(int x, int y){
        this.begin.setX(x);
        this.begin.setY(y);
    }
    public void setEndX(int endX) {
        this.end.setX(endX);
    }
    public void setEndY(int endY) {
        this.end.setY(endY);
    }
    public void setEndXY(int x, int y){
        this.end.setX(x);
        this.end.setY(y);
    }
    /*
    public double getLength(LineSub ln){
        return begin.distance(end);
    }*/
    // Length of the line
    public double getGradient(){
        return Math.atan2(end.getY()-begin.getY(), end.getX()-begin.getX());
    } // Gradient in radians
}

