import java.util.Scanner;

public class Exercise2_21{
    public static void main(String[] args){
        // Create a scanner object.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter investment amount: ");
        double investment_amount = input.nextDouble();

        System.out.println("Please enter annual interest rate in percentage: ");
        double interest_rate = input.nextDouble();

        System.out.println("Please enter number of years ");
        double years = input.nextDouble();

        double years_by_month = years * 12;

        double interest_rate_plus = 1 + interest_rate;

        double interest_rate_pow = Math.pow(interest_rate_plus, years_by_month);

        double result = investment_amount * interest_rate_pow;

        System.out.println("Accumulated value is: " + result);

    }
}