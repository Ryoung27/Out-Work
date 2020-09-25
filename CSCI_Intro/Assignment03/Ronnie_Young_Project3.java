/*
 * Description: Third Assignment:
 * This project was designed to reinforce programming concepts from Chapter 3. In this
 *project, the students will practice:
1. Use the if-else statements to decide whether the input is valid. If not, print out
the error message and exit the program.
2. Use if-else structure to display the letter grade.
3. Comment away the code (do NOT delete ) and rewrite it by using switch
structure (please notice that in general, you may not be able to rewrite an if-else
statement to switch statement.
4. In this program, we don’t validate user’s input. We assume that user will enter a
score between 0 and 100 inclusive. After we study loop (Chapter 4), we can
validate the input. As long as the user’s input is out of the legal range, the
program will keep to prompt the user to enter a legal score
 *
 * @author: Ronnie Young
 * @version 08.31.20
 */

import java.util.Scanner; // import scanner package

public class Ronnie_Young_Project3 {
    public static void main(String[] args){
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt the user to input a score (between 0 and 100, inclusive).
        System.out.print("Please enter your score (between 0 and 100, inclusive): ");
        int score = input.nextInt();

        //Determine if the score is invalid.
        //1. Use the if-else statements to decide whether the input is valid. If not, print out
        // the error message and exit the program.
        if (score < 0 || score > 100)
            System.out.println("Error message: enter a numeric value (0-100)");
        // 2. Use if-else structure to display the letter grade
        // else
        //     if (score > 89)
        //         System.out.println("Your grade is: A ");
        //     else if (score > 84)
        //         System.out.println("Your grade is: B ");
        //     else if (score > 74)
        //         System.out.println("Your grade is: C ");
        //     else if (score > 69)
        //         System.out.println("Your grade is: D ");
        //     else
        //         System.out.println("You grade is: F ");

        // 3. Comment away the code (do NOT delete ) and rewrite it by using switch
        // structure (please notice that in general, you may not be able to rewrite an if-else
        // statement to switch statement
        else
            switch(score / 10){
                case 9: System.out.println("Your grade is: A"); break;
                case 8: System.out.println("Your grade is: B"); break;
                case 7: System.out.println("Your grade is: C"); break;
                case 6: System.out.println("Your grade is: D"); break;
                default:
                  System.out.println("Your grade is: F");
            }

    }

}