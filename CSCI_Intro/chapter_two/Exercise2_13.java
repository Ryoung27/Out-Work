import java.util.Scanner;

public class Exercise2_13{
    public static void main(String[] args){
        // Create a scanner object.
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a starting amount, ex: 100.00: ");

        double starting_amount = input.nextDouble();

        double month_one_interest = starting_amount * (1 + 0.00417);

        double month_two_interest = (starting_amount + month_one_interest) * (1 + 0.00417);

        double month_three_interest = (starting_amount + month_two_interest) * (1 + 0.00417);

        double month_four_interest = (starting_amount + month_three_interest) * (1 + 0.00417);

        double month_five_interest = (starting_amount + month_four_interest) * (1 + 0.00417);

        double month_six_interest = (starting_amount + month_five_interest) * (1 + 0.00417);

        System.out.println("After the sixth month the account balance is " + month_six_interest);
    }
}