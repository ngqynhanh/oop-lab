package question2;

import question1.Point2D;

public class Triangle {
    private Point2D point1;
    private Point2D point2;
    private Point2D point3;

    Triangle(Point2D p1, Point2D p2, Point2D p3) {
        point1 = p1;
        point2 = p2;
        point3 = p3;
    }

    public double perimeter() {
        return point1.distance(point2) + point2.distance(point3) + point3.distance(point1);
    }

    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - point1.distance(point2)) * (s - point2.distance(point3)) * (s - point3.distance(point1)));
    }
}
