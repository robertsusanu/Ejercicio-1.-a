package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoC;

public class Mammal extends Animal{
    public Mammal(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}
