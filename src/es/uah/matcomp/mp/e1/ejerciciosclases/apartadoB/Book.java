package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoB;

public class Book {
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    /*public String getAuthorsName(){
        String mensaje="";
        for(int i = 0; i < authors.length; i++){
            mensaje = mensaje + "[";
            mensaje = mensaje + authors[i].getName() + ", ";
            mensaje = mensaje + authors[i].getEmail() + ", ";
            mensaje = mensaje + "]; ";
        }
        return mensaje;
    }*/
    public String getAuthorName(){
        return author.getName();
    }

    public String toString() {
        return "Book [isbn=" + isbn + ", name=" + name + "," + author + ", price=" + price + ", qty=" + qty + "]";
    } // Solo con nombrar al autor ya se reusa el toString() del autor
    //Me faltan el de arriba para poner los autores, y el de abajo completo


}