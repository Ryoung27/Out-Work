/*
 * Description: Fifth Assignment:
This	project was	designed	to	reinforce	the	concept	of	for,	while,	and	do	while statements	from	Chapter
5 of	textbook.	In	this	project	the	student will	practice
1. Using	an	for structure.
2. Replacing	an	for structure	with	a	while statement.
3. Using	do	while to	repeat	things	that	at	least	be	done	one time
 *
 * @author: Ronnie Young
 * @version 09.23.20
 */

import java.util.Scanner; // import scanner package

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Ronnie_Young_Project5 {
    private static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args){
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        //Principle, Term(in year), Quoted Interest Rate
        int principle, term, totalTermInMonths, counter = 0;
        double interestRate, monthlyPayment, totalInterest = 0.0, endOfMonthBalance = 0.0, totalOwed = 0.0, principlePayment = 0.0, interestPayment = 0.0;
        char runAnother = 'Y';

        System.out.println("Please enter your principle, term, and interest rate: ");
        System.out.print("Enter the principle to borrow: ");
        principle = input.nextInt();

        System.out.print("Enter the interest rate in decimal: ");
        interestRate = input.nextDouble();

        System.out.print("Enter the term (in years): ");
        term = input.nextInt();
        totalTermInMonths = term*12;

        totalOwed = principle + (principle * interestRate);

        // System.out.println(monthlyPayment);
        System.out.println("Month       " + "Payment      " + "Total Interest       " + "Balance             " + "Principal Payment       " + "Interest Payment      ");

        //Do While Loop
        // do{
        //     System.out.println("Please enter your principle, term, and interest rate: ");
        //     System.out.print("Enter the principle to borrow: ");
        //     principle = input.nextInt();

        //     System.out.print("Enter the interest rate in decimal: ");
        //     interestRate = input.nextDouble();

        //     System.out.print("Enter the term (in years): ");
        //     term = input.nextInt();
        //     totalTermInMonths = term*12;

        //     totalOwed = principle + (principle * interestRate);

        //     // System.out.println(monthlyPayment);
        //     System.out.println("Month       " + "Payment      " + "Total Interest       " + "Balance       ");
        //     do {
        //         counter++;
        //         monthlyPayment = principle * (interestRate/12) * Math.pow(1 + (interestRate/12), totalTermInMonths)/(Math.pow(1 + (interestRate/12), totalTermInMonths) - 1);

        //         if(totalOwed - monthlyPayment < 0){
        //             totalOwed = totalOwed;
        //             monthlyPayment = totalOwed;
        //         }
        //         else{
        //             totalOwed = totalOwed - monthlyPayment;
        //         }

        //         totalInterest += monthlyPayment * interestRate;
        //         System.out.printf("  " + i + "        $%.2f          $%.2f            $%.2f           $%.2f             $%.2f\n", monthlyPayment, totalInterest, totalOwed, principlePayment, interestPayment);
        //     } while(counter < totalTermInMonths);
        //     System.out.println("Would you like to run this again?");
        //     runAnother = input.next().charAt(0);
        // } while(runAnother == 'Y' || runAnother == 'y');



        //While structure
        // while(counter < totalTermInMonths){
        //     counter++;
        //     monthlyPayment = principle * (interestRate/12) * Math.pow(1 + (interestRate/12), totalTermInMonths)/(Math.pow(1 + (interestRate/12), totalTermInMonths) - 1);

        //     if(totalOwed - monthlyPayment < 0){
        //         totalOwed = totalOwed;
        //         monthlyPayment = totalOwed;
        //     }
        //     else{
        //         totalOwed = totalOwed - monthlyPayment;
        //     }

        //     totalInterest += monthlyPayment * interestRate;
        //     System.out.printf("  " + i + "        $%.2f          $%.2f            $%.2f           $%.2f             $%.2f\n", monthlyPayment, totalInterest, totalOwed, principlePayment, interestPayment);
        // }



        // For loop structure.
        // Create a for loop starting at 1 and incrementing by 1 for the total months of the loan, I started at 1 to use it as the proper month counter.
        for(int i = 1; i <= totalTermInMonths; i++){
            // Calcuate the monthly payment.
            monthlyPayment = principle * (interestRate/12) * Math.pow(1 + (interestRate/12), totalTermInMonths)/(Math.pow(1 + (interestRate/12), totalTermInMonths) - 1);
            // If the final amount owed is less than the monthly payment, that's all that is left to charge.
            if(totalOwed - monthlyPayment < 0){
                totalOwed = totalOwed;
                monthlyPayment = totalOwed;
            }
            else{
                totalOwed = totalOwed - monthlyPayment;
            }

            totalInterest += monthlyPayment * interestRate;

            interestPayment = monthlyPayment * interestRate;

            principlePayment = monthlyPayment - interestPayment;

            System.out.printf("  " + i + "        $%.2f          $%.2f            $%.2f           $%.2f             $%.2f\n", monthlyPayment, totalInterest, totalOwed, principlePayment, interestPayment);
        }

    }
}