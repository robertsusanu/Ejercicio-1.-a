package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoB;

public class MyCircle {
    private MyPoint center;
    private int radius = 1;

    public MyCircle(){
    }
    public MyCircle(int x, int y, int radius){
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }
    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }
    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.getX();
    }
    public int getCenterY() {
        return center.getY();
    }
    public int[] getCenterXY(){
        return new int[]{getCenterX(), getCenterY()};
    } //ESTA MAL, no retorna lo que debe retornar
    public void setCenterX(int x) {
        this.center.setX(x);
    }
    public void setCenterY(int y) {
        this.center.setY(y);
    }
    public void setCenterXY(int x, int y){
        this.center = new MyPoint(x, y);
    }

    public String toString(){
        return "MyCircle[radius=" + radius + ", center=" + center + "]";
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public double distance(MyCircle other){
        return  Math.sqrt(((other.getCenterX())^2) + ((other.getCenterY()))^2);
    } // La distancia no esta terminada
}
