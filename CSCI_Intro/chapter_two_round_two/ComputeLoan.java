import java.util.Scanner;
public class ComputeLoan{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the annual interest rate, e.g., 7.25%");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;


    }
}