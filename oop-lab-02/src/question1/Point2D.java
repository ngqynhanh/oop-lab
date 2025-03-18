package question1;

import java.util.Scanner;

public class Point2D {
    private int x;
    private int y;

    public Point2D() {
        this(0,0);
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point2D(Point2D p) {
        x = p.x;
        y = p.y;
    }

    //getter
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //Enter the coordinates for the point from the keyboard
    public void input() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your coordinate (x, y): ");
        System.out.print("x = ");
        x = scanner.nextInt();
        System.out.print("y = ");
        y = scanner.nextInt();
        scanner.close();
    }

    public String ToString() {
        return "(" + x +", " + y + ")";
    }

    //Move point to new coordinate
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Check if the point is origin (0,0)
    public boolean isOrigin() {
        return x == 0 && y == 0;
    }

    //Function to calculate the distance from point to point p
    public double distance(Point2D p) {
        double dx = p.x - this.x;
        double dy = p.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    //Static function to calculate the distance between two points p1 and p2
    public static double distance(Point2D p1, Point2D p2) {
        return p1.distance(p2);
    }

}
