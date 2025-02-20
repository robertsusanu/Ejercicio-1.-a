package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoC;

public class Square extends Rectangle {
    private double side;

    public Square() {}
    public Square(double side) {
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        super(color,filled);
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        this.side = side;
    }
    @Override
    public void setLength(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + ", width=" + super.getWidth() + "length=" + super.getLength() + "]";
    }
}
