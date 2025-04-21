package question2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ResizableCircle r1 = new ResizableCircle(15);
        System.out.println(r1.toString());
        r1.resize(10);
        System.out.println("After resizing: " + r1.toString());
        System.out.println("Area: "+r1.getArea());
        System.out.println("Perimeter: "+r1.getPerimeter());
    }
}