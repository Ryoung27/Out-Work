import java.util.Scanner;

public class Exercise2_7{
    public static void main(String[] args){
        // Initialize the Scanner Object.
        Scanner input = new Scanner(System.in);
        // Get the user input.
        System.out.println("Please enter a number of minutes: ");
        int user_minutes = input.nextInt();

        int hours = user_minutes / 60;

        int days = hours / 24;

        int years = days / 365;

        days = days % 365;

        System.out.println(user_minutes + " minutes is approximately " + years + " years and " + days + " days.");
    }
}