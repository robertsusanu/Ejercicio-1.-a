package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoB;

public class TestMyTriangle {
    public static void main(String[] args) {
        //Constructor 1
        MyTriangle Tri1 = new MyTriangle(0,0,2, 0,1, 2);
        System.out.println(Tri1);
        //Constructor 2
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(4, 0);
        MyPoint p3 = new MyPoint(2, 3);
        MyTriangle Tri2 = new MyTriangle(p1, p2, p3);
        System.out.println(Tri2);
        MyTriangle Tri3 = new MyTriangle(0,0,4, 1,1, 3);




        System.out.println("El perimetro es= " + Tri1.getPerimeter());
        System.out.println("El tipo del triangulos es: " + Tri1.getType());//pone isosceles pq un quilatero con enteros es complicado
        System.out.println("El tipo del triangulos es: " + Tri2.getType());//isosceles
        System.out.println("El tipo del triangulos es: " + Tri3.getType());//escaleno
    }
}