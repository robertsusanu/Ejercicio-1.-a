package es.uah.matcomp.mp.e1.ejerciciosclases.ApartadoD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    Rectangle Rec1 = new Rectangle(5, 5);

    @Test
    void getWidth() {
        System.out.println(Rec1.getWidth());
    }

    @Test
    void setWidth() {
        Rec1.setWidth(10);
        System.out.println(Rec1.getWidth());
    }

    @Test
    void getLength() {
        System.out.println(Rec1.getLength());
    }

    @Test
    void setLength() {
        Rec1.setLength(10);
        System.out.println(Rec1.getLength());
    }

    @Test
    void getArea() {
        System.out.println(Rec1.getArea());
    }

    @Test
    void getPerimeter() {
        System.out.println(Rec1.getPerimeter());
    }

    @Test
    void testToString() {
        System.out.println(Rec1.toString());
    }
}