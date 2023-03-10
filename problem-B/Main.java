import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Circle c2 = new Circle(5.5, "red", false);
        System.out.println(c2);
        System.out.println(c2.getArea());
        System.out.println(c2.getPerimeter());
        System.out.println(c2.getColor());
        System.out.println(c2.isFilled());
        System.out.println(c2.getRadius());

        Rectangle r2 = new Rectangle(3.8, 2.5, "green", false);

        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
        System.out.println(r2.getLength());

        Square square = new Square(6.6);
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getColor());
        System.out.println(square.getSide());

    }
}
