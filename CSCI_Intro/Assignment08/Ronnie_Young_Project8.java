/*
 * Write a program that takes user intake for a number between 0 and 511 and displays the corresponding results for a 3X3 matrix.
 *
 * @author: Ronnie Young
 * @version 10.13.20
 */

import java.util.Scanner; // import scanner package

public class Ronnie_Young_Project8 {
    public static void main(String[] args){
        // Initalize the array.
        int intArray[][] = new int[3][3];
        // Initalize user_input to -1 for the while loop.
        int user_input = -1;

        // Get the users input.
        Scanner input = new Scanner(System.in);

        // User a while loop to validate user input.
        while (user_input > 511 || user_input < 0){
            System.out.println("Please enter a number between 0 - 511: ");

            user_input = input.nextInt();
        }

        // Call decimal_to_binary to convert the value of the matrix.
        int[] nums = decimal_to_binary(user_input);

        // Loop over the matrix to output H or T to complete the coin matrix.
        for (int i = 0; i<9; i++){

            if (nums[i] == 0)
                System.out.print("H ");

            else
                System.out.print("T ");

            if ((i+1) % 3 == 0)
                System.out.println();
        }
    }

    public static int[] decimal_to_binary(int decimal){
        int[] nums = new int[9];

        // Renumber the array based on the value of decimal.
        for (int i = nums.length-1; i>=0 && decimal >0; i--){
            if (decimal % 2 == 0)
                nums[i] = 0;
            else
                nums[i] = 1;
            decimal /= 2;
        }
        // Return the nums array.
        return nums;
    }
}