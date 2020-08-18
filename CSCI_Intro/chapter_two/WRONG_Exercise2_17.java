import java.util.Scanner;

public class Exercise2_17{
    public static void main(String[] args){
        // Create a scanner object.
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a temperature in Fahrenheit between -58 and 41:  ");

        double temp_in_fahrenheit = input.nextDouble();

        System.out.println("Please enter the wind speed (>=2) in miles per hour:  ");

        double wind_speed = input.nextDouble();

        double result = (35.74 + (0.6215 * temp_in_fahrenheit * wind_speed) - (35.75 * (Math.pow(wind_speed, 0.16)) + (0.4275 * temp_in_fahrenheit * Math.pow(wind_speed, 0.16))));

        System.out.println("The windchill index is: " + result);

    }
}