package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoB.Customer_Account;

public class Customer {
    private int id;
    private String name;
    private char gender;

    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }
    public  String getName(){
        return name;
    }
    public  int getGender(){
        return gender;
    }

    public String toString(){
        return name + "(" + id + ")";
    }
}
