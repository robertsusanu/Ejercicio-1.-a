package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoB;

public class TestMyCircle {
    public static void main(String[] args) {
        //Constructor 1
        MyCircle Cir1 = new MyCircle();
        //Constructor 2
        MyCircle Cir2 = new MyCircle(2,3,4);
        //Constructor 3
        MyPoint p1 = new MyPoint(4,5);
        MyCircle Cir3 = new MyCircle(p1, 8);
        System.out.println(Cir1);
        System.out.println(Cir2);
        System.out.println(Cir3);

        //get
        System.out.println("El radio es: " + Cir2.getRadius());
        System.out.println("El centro es: " + Cir2.getCenter());
        System.out.println("El X del centro es: " + Cir2.getCenterX());
        System.out.println("El Y del centro es: " + Cir2.getCenterY());
        System.out.println("El X e Y del centro es: " + Cir2.getCenterXY());

        //Set
        Cir1.setRadius(5);
        MyPoint p2 = new MyPoint(5,5);
        Cir1.setCenter(p2);
        System.out.println(Cir1);

        Cir1.setCenterX(2);
        Cir1.setCenterY(2);
        System.out.println(Cir1);

        Cir1.setCenterXY(3, 3);
        System.out.println(Cir1);

        //Calculos
        System.out.println("El area es: " + Cir2.getArea());
        System.out.println("La circumferencia es: " + Cir2.getCircumference());
        System.out.println("La distancia es: " + Cir1.distance(Cir2));
    }
}
