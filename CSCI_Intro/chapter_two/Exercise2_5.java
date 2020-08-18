import java.util.Scanner;

public class Exercise2_5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Prompt the user for a number in pounds.
        System.out.print("Please enter the subtotal: ");
        double subtotal = input.nextDouble();

        System.out.print("Please enter the gratuity rate as a percentage: ");
        double gratuity = input.nextDouble();

        double total = subtotal + (subtotal * (gratuity / 100));

        System.out.println(subtotal + " gratuity of " + gratuity + "%" + " is " + "$" + total);


    }
}