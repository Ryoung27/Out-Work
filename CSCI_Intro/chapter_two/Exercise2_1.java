import java.util.Scanner;
public class Exercise2_1{
    public static void main(String[] args){

        final double FRACTION = (9.0/5); //Declare a constant
        final double THIRTY_TWO = 32; // Another exercise

        //Create a scanner object.
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a degree in Celcius.
        System.out.print("Please enter a temp in celcius, number only: ");
        double celcius = input.nextDouble();

        double fahrenheit = FRACTION * celcius + THIRTY_TWO;

        System.out.println(fahrenheit);
    }
}