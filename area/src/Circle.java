import java.util.Scanner;

public class Circle {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double radius = scan.nextDouble();
        double area= Math.PI * radius*radius;
        double circumference = 2* Math.PI * radius;
        System.out.println("Area of circle is"+area+"\n"+"circumference of the circle is"+circumference + ".");
    }
}
