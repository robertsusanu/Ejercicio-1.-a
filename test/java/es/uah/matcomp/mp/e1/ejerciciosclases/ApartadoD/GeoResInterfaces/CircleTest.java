package es.uah.matcomp.mp.e1.ejerciciosclases.ApartadoD.GeoResInterfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle Cir1 = new Circle(5);

    @Test
    void testToString() {
        System.out.println(Cir1.toString());
    }

    @Test
    void getArea() {
        System.out.println(Cir1.getArea());
    }

    @Test
    void getPerimeter() {
        System.out.println(Cir1.getPerimeter());
    }
}