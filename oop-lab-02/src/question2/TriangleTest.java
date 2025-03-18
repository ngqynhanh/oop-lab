package question2;

import question1.Point2D;

public class TriangleTest {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D(2, 7);
        Point2D p3 = new Point2D(3, 4);
        System.out.println(p1.ToString());
        System.out.println(p2.ToString());
        System.out.println(p3.ToString());

        Triangle myTriangle = new Triangle(p1, p2, p3);
        System.out.println("Perimeter: " + myTriangle.perimeter());
        System.out.println("Area: " + myTriangle.area());
    }
}
