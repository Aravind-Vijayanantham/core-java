import java.util.Scanner;
public class Quadratic_formula
{
    public static void main(String[] args)
    {
        System.out.println("To find quadratic values enter non zero numbers");
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the value for a");
        double a = scan.nextDouble();
        System.out.println("Enter the value for b");
        double b = scan.nextDouble();
        System.out.println("Enter the value for c");
        double c = scan.nextDouble();
        double sqrt = Math.sqrt(b * b - 4 * a * c);
        double result_one = (-1 * b + sqrt) / (2*a);
        double result_two = (-1 * b - sqrt) / (2*a);
        System.out.println("The first result is" +result_one);
        System.out.println("The second result is" +result_two);


    }
}
