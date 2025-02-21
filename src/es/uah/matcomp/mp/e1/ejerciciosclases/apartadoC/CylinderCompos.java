package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoC;

public class CylinderCompos {
    private Circle base;
    private double height;

    public CylinderCompos() {
        height = 1.0;
    }

    // Constructor with default radius, color but given height
    public CylinderCompos(double height) {
        super();
        this.height = height;
    }
    // Constructor with default color, but given radius, height
    public CylinderCompos(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    //Constructor with the three atributes
    public CylinderCompos(Circle base, double height, String color) {
        this.base = base;
        this.height = height;
    }


    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    // A public method for computing the volume of cylinder
// use superclass method getArea() to get the base area
    public double getVolume() {
        return base.getArea() *height;
    }


    public double getRadius() {
        return base.getRadius();
    }


    public double getArea(){
        return (2*base.getArea() + (2*Math.PI*height*base.getRadius()));
    }

    public String toString() { // in Cylinder class
        return "Cylinder: subclass of " + super.toString() // use Circle's toString()
                + " height=" + height;
    }
}

