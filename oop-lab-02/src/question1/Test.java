package question1;

public class Test {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        System.out.println("The initial value of p1: " + p1.ToString());
        System.out.println("Is p1 at the origin? " + p1.isOrigin());
        System.out.println("Asking user to change values for p1: ");
        p1.input();
        System.out.println("The value of p1: " + p1.ToString());
        p1.move(3,5);
        System.out.println("The value of p1 after moving: " + p1.ToString());

        Point2D p2 = new Point2D(4,7);
        System.out.println("The value of p2: " + p2.ToString());

        Point2D p3 = new Point2D(p2);
        System.out.println("The value of p3: " + p3.ToString());
        System.out.println("First way to calculate distance between p1 and p2: " + p1.distance(p2));
        System.out.println("Second way to calculate distance between p1 and p2: " + Point2D.distance(p1,p2));
        System.out.println("First way to calculate distance between p2 and p2: " + p2.distance(p3));
        System.out.println("Second way to calculate distance between p2 and p3: " + Point2D.distance(p2,p3));

    }
}
