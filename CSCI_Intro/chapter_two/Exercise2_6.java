import java.util.Scanner;

public class Exercise2_6{
    public static void main(String[] args){
        // Initialize the Scanner Object.
        Scanner input = new Scanner(System.in);
        // Get the user input.
        System.out.print("Please enter a whole number: ");
        int user_input = input.nextInt();

        //Get the value then store it to a variable then remove it from the input.
        int ones = user_input % 10;
        user_input = user_input / 10;

        int tens = user_input % 10;
        user_input = user_input / 10;

        int hundreds = user_input % 10;
        user_input = user_input / 10;

        int thousands = user_input % 10;
        //Print the total value.
        System.out.println(ones + tens + hundreds + thousands);
    }
}