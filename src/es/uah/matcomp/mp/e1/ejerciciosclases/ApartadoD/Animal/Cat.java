package es.uah.matcomp.mp.e1.ejerciciosclases.ApartadoD.Animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void greets(){
        System.out.println("Meow");
    }
}
