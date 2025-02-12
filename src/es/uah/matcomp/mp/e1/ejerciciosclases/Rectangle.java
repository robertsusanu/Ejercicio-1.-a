package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        length = 1.0;
        width = 1.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }
}
