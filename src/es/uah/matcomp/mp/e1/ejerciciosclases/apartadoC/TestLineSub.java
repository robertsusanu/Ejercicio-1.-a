package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoC;

import es.uah.matcomp.mp.e1.ejerciciosclases.apartadoB.MyLine;
import es.uah.matcomp.mp.e1.ejerciciosclases.apartadoB.MyPoint;

public class TestLineSub {
    public static void main(String[] args) {
        //constructor 1
        LineSub ln1 = new LineSub(2,2,4,4);
        System.out.println(ln1);

        //Constructor 2
        Point p1 = new Point(3,3);
        Point p2 = new Point(6,6);
        LineSub ln2 = new LineSub(p1,p2);
        System.out.println(ln2);

        //get
        System.out.println("begin is: " + ln1.getBegin()); // Test getters
        System.out.println("end is: " + ln1.getEnd());
        System.out.println("begin X is: " + ln1.getBeginX());
        System.out.println("end X is: " + ln1.getEndX());
        System.out.println("begin Y is: " + ln1.getBeginY());
        System.out.println("end Y is: " + ln1.getEndY());
        //System.out.println("length is: " + ln1.getLength(ln2));
        System.out.println("the gradient in radians is: " + ln1.getGradient());

        //Set
        ln1.setBegin(p1);
        ln1.setEnd(p2);
        System.out.println(ln1);

        ln2.setBeginX(4);
        ln2.setEndX(8);
        System.out.println(ln2);
        ln2.setBeginY(4);
        ln2.setEndY(8);
        System.out.println(ln2);

        LineSub ln3 = new LineSub(1,1,2,2);
        System.out.println(ln3);
        ln3.setBeginXY(5, 5);
        ln3.setEndXY(10, 10);
        System.out.println(ln3);
    }
}

