/**
 * Description: Second Assignment:
 * This project was designed to reinforce programming concepts from Chapter 2. In this
 *project, the students will practice:
 *1. Declare variables
 *2. Use Scanner and String objects
 *3. Do arithmetic operations, including /, %
 *4. Use basic data types int
 *
 * @author: Ronnie Young
 * @version 08.24.20
 */

import java.util.Scanner; // import scanner package
import java.util.Random;  // import random package

public class Ronnie_Young_Project2
{
    public static void main(String[] args){
        // Create a Scanner Object
        // Scanner input = new Scanner(System.in);

        // Get the amount from the user.
        // System.out.print("Please enter an amount between 1 cent and 99 cents: ");
        // I kept a starting amount to use in the final print out.
        // int starting_amount = input.nextInt();

        // create instance of Random class
        Random rand = new Random();

        // Get int starting_amount as a random value.
        // The max and min allow me to generate random
        // numbers between 1 and 99 instead of 0-99.
        int max = 100;
        int min = 1;
        int starting_amount = rand.nextInt((max - min) + 1) + min;

         // Get the amount as an int.
        int amount = starting_amount;

        // Calculate the number of quarters.
        int quartersInAmount = amount / 25;
        // Remove the quarters from amount after getting the amount of quarters in amount.
        amount = amount % 25;

        // Calculate the number of dimes.
        int dimesInAmount = amount / 10;
        // Remove the dimes from amount after getting the amount of dimes in amount.
        amount = amount % 10;

        // Calculate the number of nickels.
        int nickelsInAmount = amount / 5;
        // Remove the nickels from amount after getting the amount of nickels in amount.
        amount = amount % 5;

        // Calculate the number of pennies.
        int penniesInAmount = amount / 1;
        // Remove the pennies from amount after getting the amount of pennies in amount.
        amount = amount % 1;

        System.out.print("The amount of your change is " + starting_amount + " cents. That is: \n");
        System.out.print(quartersInAmount + " quarter(s) \n");
        System.out.print(dimesInAmount + " dime(s) \n");
        System.out.print(nickelsInAmount + " nickel(s) \n");
        System.out.print(penniesInAmount + " pennie(s) \n");
    }
}
