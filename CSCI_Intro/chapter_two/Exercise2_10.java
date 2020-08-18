import java.util.Scanner;

public class Exercise2_10{
    public static void main(String[] args){
        // Initialize the Scanner Object.
        Scanner input = new Scanner(System.in);
        // Get the user input.
        //Water weight in kilograms.
        System.out.println("Please enter the amount of water in kilograms: ");
        double M = input.nextDouble();
        //Initial temperature.
        System.out.println("Please enter the initial temperature: ");
        double initial_temperature = input.nextDouble();
        //Final temperature.
        System.out.println("Please enter the final temperature: ");
        double final_temperature = input.nextDouble();

        double Q = M * (final_temperature - initial_temperature) * 4184;

        System.out.println("The energy needed is " + Q + ".");
    }
}