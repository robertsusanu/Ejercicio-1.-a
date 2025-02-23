package es.uah.matcomp.mp.e1.ejerciciosclases.ApartadoD.Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal An1 = new Animal("Elefante") {
    };

    @Test
    void greets() {
        An1.greets();
    }
}