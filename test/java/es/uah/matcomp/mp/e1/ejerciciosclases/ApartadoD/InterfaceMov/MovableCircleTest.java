package es.uah.matcomp.mp.e1.ejerciciosclases.ApartadoD.InterfaceMov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MovableCircleTest {

    MovableCircle MCir = new MovableCircle(2,2, 3, 3,4);

    @Test
    void testToString() {
        System.out.println(MCir.toString());
    }

    @Test
    void moveUp() {
        MCir.moveUp();
        System.out.println(MCir.toString());
    }

    @Test
    void moveDown() {
        MCir.moveDown();
        System.out.println(MCir.toString());
    }

    @Test
    void moveLeft() {
        MCir.moveLeft();
        System.out.println(MCir.toString());
    }

    @Test
    void moveRight() {
        MCir.moveRight();
        System.out.println(MCir.toString());
    }
}