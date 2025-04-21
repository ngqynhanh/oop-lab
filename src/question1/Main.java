package question1;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(15);
        System.out.println(c1.toString());
        System.out.println("Area: "+c1.getArea());
        System.out.println("Perimeter: "+c1.getPerimeter());

        Rectangle r1 = new Rectangle(5, 10);
        System.out.println(r1.toString());
        System.out.println("Area: "+r1.getArea());
        System.out.println("Perimeter: "+r1.getPerimeter());
    }
}