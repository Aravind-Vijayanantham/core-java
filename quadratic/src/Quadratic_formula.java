import java.util.Scanner;
public class Quadratic_formula
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double sqrt = Math.sqrt(b * b - 4 * a * c);
        double result_one = (-1 * b + sqrt) / (2*a);
        double result_two = (-1 * b - sqrt) / (2*a);
        System.out.println(result_one);
        System.out.println(result_two);


    }
}
