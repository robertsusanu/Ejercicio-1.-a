package es.uah.matcomp.mp.e1.ejerciciosclases.ApartadoD.InterfaceMov;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center.x = x;
        this.center.y = y;
        this.center.xSpeed = xSpeed;
        this.center.ySpeed = ySpeed;
        this.radius = radius;
    }

    public String toString(){
        return "(" + center.x + "," + center.y + "), speed=(" + center.xSpeed + "," + center.ySpeed + "), radius= " + radius;
    }

    @Override
    public void moveUp(){
        center.moveUp();
    }
    @Override
    public void moveDown(){
        center.moveDown();
    }

    @Override
    public void moveLeft(){
        center.moveLeft();
    }
    @Override
    public void moveRight(){
        center.moveRight();
    }
}
