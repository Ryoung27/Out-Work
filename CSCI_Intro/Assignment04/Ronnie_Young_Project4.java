/*
 * Description: Third Assignment:
 * Part - 1 :    Directly use the Java built-in method. In this case, only couple lines of code. Hint: Study Integer class in Java.  (20%)
 * Part - 2 :    Write your own code to convert a Binary String to Decimal.  (80%)
 * Using the Scanner class, the user input should be  a Binary String data type.
 * The program should display  its corresponding Decimal value.
 * Note:  Please do both ways and test them correctly to get 100% credit.
 * This project was designed to reinforce programming concepts from Chapter 3. In this
 *project, the students will practice:
 *
 * @author: Ronnie Young
 * @version 09.07.20
 */

import java.util.Scanner; // import scanner package

public class Ronnie_Young_Project4 {
    public static void main(String[] args){
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt the user to input a binary digit).
        System.out.print("Please enter a binary digit: ");
        //Part - 1 :    Directly use the Java built-in method. In this case, only couple lines of code. Hint: Study Integer class in Java.  (20%)
        // String binaryInput =input.nextLine();
        // System.out.println("Output: "+ Double.parseDouble(binaryInput));

        //Part - 2:
        //Using the Scanner class, the user input should be  a Binary String data type.
        String binaryInput =input.nextLine();
        if(binaryInput.length() < 1){
            System.out.println("You have to input atleast one number.");
        }
        else{
            System.out.println("Your binary string converted to a double is "+ Double.parseDouble(binaryInput));
        }
    }
}
