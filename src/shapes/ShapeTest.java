package shapes;

import java.awt.*;

public class ShapeTest {

    public static void main(String[] args) {

        Quadrilateral myShape;

        myShape = new Rectangle(10,10);
        System.out.println("Area: " + myShape.getArea());
        System.out.println("Perimeter: " + myShape.getPerimeter());



//        Square square1 = new Square(30);
//        System.out.println("Square perimeter is: " + square1.getPerimeter());
//
////        Rectangle box1 = new Rectangle(10,6);
//        System.out.println("box1 perimeter is: " + box1.getPerimeter());
//        System.out.println("box1 area is: " + box1.getArea());
//
//        Rectangle box2 = new Square(20);
//        System.out.println("box2 perimeter is: " + box2.getPerimeter());
//        System.out.println("box2 area is: " + box2.getArea());

    }
}