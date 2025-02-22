package es.uah.matcomp.mp.e1.ejerciciosclases.ApartadoD.InterfaceCirRec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    GeometricObject Rec1 = new Rectangle(5, 5);

    @Test
    void testToString() {
        System.out.println(Rec1.toString());
    }

    @Test
    void getArea() {
        System.out.println(Rec1.getArea());
    }

    @Test
    void getPerimeter() {
        System.out.println(Rec1.getPerimeter());
    }
}