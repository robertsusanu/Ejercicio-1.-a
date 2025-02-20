package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoC;

public class Dog extends Mammal{
    public Dog(String name){
        super(name);
    }

    public void greets(){
        System.out.println("Woof");
    }

    public void greets(Dog other){
        System.out.println("Woooof");
    }

    @Override
    public String toString(){
        return "Dog[" + super.toString() + "]";
    }
}
