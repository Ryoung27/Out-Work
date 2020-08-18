import java.util.Scanner;

public class exercise2_14{
    public static void main(String[] args){
        // Create a scanner object.
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your weight in pounds: ");

        double weight_in_pounds = input.nextDouble();

        double weight_in_kilos = weight_in_pounds * 0.45359237;

        System.out.println("Please enter your height in inches: ");

        double height_in_inches = input.nextDouble();

        double height_in_meters = height_in_inches * 0.0254;

        double bmi = weight_in_kilos / (height_in_meters * height_in_meters);

        System.out.println("BMI is: " + bmi);

    }
}