import es.uah.matcomp.mp.e1.ejerciciosclases.apartadoB.Author;

public class Book1 {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book1(String name, Author authors[], double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public Book1(String name, Author authors[], double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }
    public Author[] getAuthors() {
        return authors;
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

    public String toString() {
        return "Book [name=" + name + "," + getAuthorsNames() + ", price=" + price + ", qty=" + qty + "]";
    } // Solo con nombrar al autor ya se reusa el toSring() del autor
    //Me faltan el de arriba para poner los autores, y el de abajo completo

    public String getAuthorsNames(){
        String mensaje="";
        for(int i = 0; i < authors.length; i++){
            mensaje = mensaje + "[";
            mensaje = mensaje + authors[i].getName() + ", ";
            mensaje = mensaje + authors[i].getEmail() + ", ";
            //mensaje = mensaje + authors[i].getGender();
            mensaje = mensaje + "]; ";
        }
        return mensaje;
    }
}
