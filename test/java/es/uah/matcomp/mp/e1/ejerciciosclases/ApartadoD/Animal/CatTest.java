package es.uah.matcomp.mp.e1.ejerciciosclases.ApartadoD.Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    Cat cat = new Cat("Lolo");

    @Test
    void greets() {
        cat.greets();
    }
}