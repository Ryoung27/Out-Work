import java.util.Scanner;

public class Exercise2_3{
    public static void main(String[] args){
        final double FEET_TO_METER = 0.305; //Declare a constant
        Scanner input = new Scanner(System.in);

        //Prompt the user for a distance in feet.
        System.out.print("Please enter a distance in feet: ");
        double feet = input.nextDouble();

        double answer = feet * FEET_TO_METER;

        System.out.println(feet + " is " + answer + " meters");


    }
}