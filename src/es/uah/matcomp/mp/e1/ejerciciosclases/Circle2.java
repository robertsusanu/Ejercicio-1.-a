package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Circle2 { // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    // Instance variable
    private double radius;

    public Circle2() { // 1st (default) constructor
        radius = 1.0;
    }
    /** Constructs a Circle instance with the given radius and default color */
    public Circle2(double radius) {
        this.radius = radius; // "this.radius" refers to the instance variable
// "radius" refers to the method's parameter
    }
    public Circle2(double r, String c){ // 3er constructor
        this.radius = 3.0;
    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }
    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }
    // Getter for instance variable color

    //public void setRadius(double newRadius) {
    //    radius = newRadius;
    //}
    /** Sets the radius to the given value */
    public void setRadius(double radius) {
        this.radius = radius; // "this.radius" refers to the instance variable
// "radius" refers to the method's argument
    }
    // Setter for instance variable color
    //public void setColor(String newColor) {
      //  this.color = newColor;
    //}
    /** Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?] */
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
}
