import java.util.Scanner;

public class Exercise2_20{
    public static void main(String[] args){
        // Create a scanner object.
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the balance and interest rate:  ");

        double balance = input.nextDouble();
        double annual_interest_rate = input.nextDouble();

        double interest = balance * (annual_interest_rate/1200);

        System.out.println("The interest rate is " + interest);
    }
}