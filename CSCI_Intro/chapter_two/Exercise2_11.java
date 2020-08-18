import java.util.Scanner;

public class Exercise2_11{
    public static void main(String[] args){
        // Create a scanner object.
        Scanner input = new Scanner(System.in);

        // Enter a number of years.
        System.out.print("Please enter the number of years: ");
        int years = input.nextInt();

        System.out.println(312032486 + ((years * 365*24*60*60)/7) - (( years * 365*24*60*60)/13) + ((years * 365*24*60*60)/45));
    }
}