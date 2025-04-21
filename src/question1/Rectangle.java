package question1;

public class Rectangle implements GeometricObject{
    private double width;
    private double length;

    public Rectangle(double x, double y) {
        width = x;
        length = y;
    }

    @Override
    public String toString() {
        return "question1.Rectangle[width=" + width +",length=" + length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
