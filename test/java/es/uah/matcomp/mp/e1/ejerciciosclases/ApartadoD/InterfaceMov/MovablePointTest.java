package es.uah.matcomp.mp.e1.ejerciciosclases.ApartadoD.InterfaceMov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MovablePointTest {

    MovablePoint MP = new MovablePoint(3, 3,6,6);

    @Test
    void testToString() {
        System.out.println(MP.toString());
    }

    @Test
    void moveUp() {
        MP.moveUp();
        System.out.println(MP);
    }

    @Test
    void moveDown() {
        MP.moveDown();
        System.out.println(MP);
    }

    @Test
    void moveLeft() {
        MP.moveLeft();
        System.out.println(MP);
    }

    @Test
    void moveRight() {
        MP.moveRight();
        System.out.println(MP);
    }
}