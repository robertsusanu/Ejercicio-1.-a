package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoC;

public class TestSuperclassAnimal {
    public static void main(String[] args) {
        Animal A1 = new Animal("Juan");
        System.out.println(A1);

        Mammal M1 = new Mammal("Pedro");
        System.out.println(M1);

        Cat C1 = new Cat("Luis");
        System.out.println(C1);

        Dog D1 = new Dog("Pepe");
        System.out.println(D1);

        C1.greets();
        D1.greets();

        Dog D2 = new Dog("Lucas");
        D1.greets(D2);
    }
    //A1.greets(); //No deja hacer la llamada porque es una
    //constante estática y se pide importar.
}
