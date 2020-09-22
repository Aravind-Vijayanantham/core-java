import java.util.Scanner;

public class Circle {
    public static void main(String[] args)
    {
        System.out.println("Enter the radius");
        Scanner scan = new Scanner(System.in);
        int radius = scan.nextInt();
        int area= (int) (Math.PI * radius*radius);
        int circumference = (int) (2* Math.PI * radius);
        System.out.println("Area of circle is "+area+"\n"+"circumference of the circle is "+circumference + ".");
    }
}
