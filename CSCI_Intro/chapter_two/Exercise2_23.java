import java.util.Scanner;
import java.util.Formatter;
import java.text.DecimalFormat;

public class Exercise2_23{
    public static void main(String[] args){
        // Initialize the Scanner Object.
        Scanner input = new Scanner(System.in);
        // Get the user input.
        System.out.println("Please enter the driving distance: ");
        double driving_distance = input.nextDouble();

        System.out.println("Please enter the miles per gallon: ");
        double miles_per_gallon = input.nextDouble();

        System.out.println("Please enter the price per gallon: ");
        double price_per_gallon = input.nextDouble();

        double gallons = (driving_distance / miles_per_gallon);

        double total = (gallons * price_per_gallon);
        //Use formatter to give an exact dollar amount.
        DecimalFormat myFormatter = new DecimalFormat("#0.00");
        String total_string = myFormatter.format(total);

        System.out.println("The cost of driving is " + total_string + " .");
    }
}