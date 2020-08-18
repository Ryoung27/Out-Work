import java.util.Scanner;

public class Exercise2_4{
    public static void main(String[] args){
        final double KILO_TO_POUND = 0.454; //Declare a constant
        Scanner input = new Scanner(System.in);

        //Prompt the user for a number in pounds.
        System.out.print("Please enter a number in pounds: ");
        double pound = input.nextDouble();

        double answer = pound * KILO_TO_POUND;

        System.out.println(pound + " is " + answer + " kilograms.");


    }
}