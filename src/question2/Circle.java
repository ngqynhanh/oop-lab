package question2;

public class Circle implements GeometricObject {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius +"]";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }
}
