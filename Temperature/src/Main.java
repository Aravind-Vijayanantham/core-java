import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("choose f or c");
        String temp_key = scan.nextLine();
        System.out.println("Enter the temperature value");
        int temp_value = scan.nextInt();
        if (temp_key.equals("f"))
        {
            double result = (temp_value - 32) / 1.8;
            System.out.println("Celsius value is " +result+ ".");
        }
        else if (temp_key.equals("c"))
        {
            double result = (temp_value*1.8+32);
            System.out.println("Fahrenheit value is " +result+ ".");
        }
        else
        {
            System.out.println("wrong input");
        }







        // write your code here
    }
}
